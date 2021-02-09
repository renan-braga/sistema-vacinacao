package br.edu.ifsp.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.edu.ifsp.conexao.Conexao;
import br.edu.ifsp.dto.HistoricoRegiaoDTO;
import br.edu.ifsp.dto.VacinaDTO;
import br.edu.ifsp.modelo.VacinaUsuario;

public class VacinaUsuarioDAO {

	public Conexao con = null;
	ResultSet rs;

	public void aplicarVacinaUsuario(VacinaUsuario vacinaUsuario) {

		try {
			this.con = Conexao.getInstance();

			String sql = "INSERT INTO vacina_aplicada VALUES (default,?,?,?,?,?)";
			PreparedStatement pstm = con.getConexao().prepareStatement(sql);

			// pstm.setInt(1, 1);
			pstm.setString(1, vacinaUsuario.getCpf());
			pstm.setString(2, vacinaUsuario.getImunobiologico());
			pstm.setDate(3, java.sql.Date.valueOf(vacinaUsuario.getDtaplicacao()));
			pstm.setDate(4, java.sql.Date.valueOf(vacinaUsuario.getDtproximaaplicacao()));

			pstm.setString(5, vacinaUsuario.getUfaplicacao());
			pstm.executeUpdate();

			System.out.println("Vacina Cadastrada!!");
			JOptionPane.showMessageDialog(null, "Vacina Cadastrada");

		} catch (SQLException e) {
			System.err.println("Erro ao cadastrar vacina");
			JOptionPane.showMessageDialog(null, "Erro ao cadastrar vacina");
			e.printStackTrace();
		}

	}

	public ArrayList<VacinaDTO> pesquisarVacina(String cpf) {
		ArrayList<VacinaDTO> lista = new ArrayList<VacinaDTO>();
		try {

			this.con = Conexao.getInstance();
			String sql = "SELECT us.nomeCompleto,us.sexo, va.* FROM vacina_aplicada va " + "INNER JOIN usuario us "
					+ "on us.cpf = va.cpf WHERE us.cpf=?";

			PreparedStatement pstm = con.getConexao().prepareStatement(sql);
			pstm.setString(1, cpf);
			rs = pstm.executeQuery();

			while (rs.next()) {
				VacinaDTO vacina = new VacinaDTO();
				vacina.setNomeUsuario(rs.getString("nomeCompleto"));
				vacina.setId(rs.getInt("id"));
				vacina.setSexoUsuario(rs.getString("sexo"));
				vacina.setImunobiologico(rs.getString("imunobiologico"));
				vacina.setDtaplicacao(rs.getDate("dt_aplicacao").toLocalDate());
				vacina.setDtproximaaplicacao(rs.getDate("dt_proxima_aplicacao").toLocalDate());
				vacina.setUfaplicacao(rs.getString("uf_aplicacao"));
				lista.add(vacina);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro ao pesquisar Vacina:" + e);
		}

		return lista;
	}

	public ArrayList<HistoricoRegiaoDTO> listarHistorico(String imunubiologico) {
		ArrayList<HistoricoRegiaoDTO> regiaoDTOs = new ArrayList<>();
		boolean comFiltro = imunubiologico != "TODOS" ? true : false;
		try {
			con = Conexao.getInstance();
			StringBuilder sb = new StringBuilder();
			sb.append(" SELECT 	re.nome_regiao, "); 
			sb.append(" 	    va.imunobiologico, ");
			sb.append(" 	    count(va.imunobiologico) ");
			sb.append(" FROM usuario us ");
			sb.append(" JOIN vacina_aplicada va ON ");
			sb.append(" 	 us.cpf = va.cpf ");
			sb.append(" JOIN regiao re ON ");
			sb.append(" 	 re.abreviacao = va.uf_aplicacao ");
			if(comFiltro)
				sb.append(" WHERE va.imunobiologico LIKE ?");
			sb.append(" GROUP BY ");
			sb.append(" 	re.nome_regiao, ");
			sb.append(" 	va.imunobiologico ");
			
			PreparedStatement ps = con.getConexao().prepareStatement(sb.toString());
			if(comFiltro)
				ps.setString(1, imunubiologico);
			
			rs = ps.executeQuery();
			while(rs.next()){
				HistoricoRegiaoDTO dto = new HistoricoRegiaoDTO();
				dto.setRegiao(rs.getString(1));
				dto.setImunobiologico(rs.getString(2));
				dto.setTotal(rs.getString(3));
				regiaoDTOs.add(dto);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return regiaoDTOs;
	}
}
