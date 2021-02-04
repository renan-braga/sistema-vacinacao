package br.edu.ifsp.dao;

import br.edu.ifsp.conexao.Conexao;
import br.edu.ifsp.modelo.Usuario;
import br.edu.ifsp.modelo.VacinaDTO;
import br.edu.ifsp.modelo.VacinaUsuario;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class UsuarioDAO {

    public Conexao con = null;
    ResultSet rs;

    public void cadastrarUsuario(Usuario usuario) {

        try {
            this.con = Conexao.getInstance();

            String sql = "INSERT INTO usuario (nomeCompleto,idade,sexo,cpf,estado) VALUES (?,?,?,?,?)";
            PreparedStatement pstm = con.getConexao().prepareStatement(sql);

            pstm.setString(1, usuario.getNome());
            pstm.setInt(2, usuario.getIdade());
            pstm.setString(3, usuario.getSexo());
            pstm.setString(4, usuario.getCPF());
            pstm.setString(5, usuario.getEstado());
            pstm.executeUpdate();

            System.out.println("Usuário inserido!!");
            JOptionPane.showMessageDialog(null, "Usuário inserida");

        } catch (SQLException e) {
            System.err.println("Erro,ao inserir um usuário");
            JOptionPane.showMessageDialog(null, "Usuário inserida");
            e.printStackTrace();
        }
    }

    public ArrayList<Usuario> consultarTodos() {

        ArrayList<Usuario> listaPessoas = new ArrayList<Usuario>();
        try {
            this.con = Conexao.getInstance();
            String sql = "SELECT * FROM usuario";

            PreparedStatement pstm = con.getConexao().prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                Usuario p = new Usuario();
                p.setNome(rs.getString("nomeCompleto"));
                p.setIdade(rs.getInt("idade"));
                p.setSexo(rs.getString("sexo"));
                p.setCPF(rs.getString("cpf"));
                p.setEstado(rs.getString("estado"));
                listaPessoas.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaPessoas;
    }

    public void removerUsuarioCPF(Usuario u) {

        try {
            this.con = Conexao.getInstance();
            String sql = "DELETE FROM usuario WHERE cpf = ?";
            PreparedStatement pstm = con.getConexao().prepareStatement(sql);
            pstm.setString(1, u.getCPF());
            pstm.executeUpdate();

            System.out.println("Usuário removido com sucesso");
            JOptionPane.showMessageDialog(null, "Usuário removida com sucesso");

        } catch (SQLException e) {
            System.out.println("Erro! Remoção negada");
            JOptionPane.showMessageDialog(null, "Erro! Remoção negada");
            e.printStackTrace();
        }
    }

    public void updateUsuarioCPF(Usuario u) {

        try {
            this.con = Conexao.getInstance();
            String sql = "UPDATE usuario SET nomeCompleto = ?,idade = ?,sexo = ?,estado = ? WHERE cpf = ?";

            PreparedStatement pstm = con.getConexao().prepareStatement(sql);
            pstm.setString(1, u.getNome());
            pstm.setInt(2, u.getIdade());
            pstm.setString(3, u.getSexo());
            pstm.setString(4, u.getEstado());
            pstm.setString(5, u.getCPF());
            pstm.executeUpdate();

            System.out.println("Usuário atualizada com sucesso");
            JOptionPane.showMessageDialog(null, "Usuário atualizada com sucesso");

        } catch (SQLException e) {
            System.out.println("Erro! Atualização negada");
            JOptionPane.showMessageDialog(null, "Erro! Atualização negada");
            e.printStackTrace();

        }
    }

    public Usuario consultarUsuarioCPF(String cpf) {

        Usuario p = new Usuario();

        try {

            this.con = Conexao.getInstance();
            String sql = "SELECT * FROM usuario WHERE cpf = ?";

            PreparedStatement pstm = con.getConexao().prepareStatement(sql);
            pstm.setString(1, cpf);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                p.setNome(rs.getString("nomeCompleto"));
                p.setIdade(rs.getInt("idade"));
                p.setSexo(rs.getString("sexo"));
                p.setCPF(rs.getString("cpf"));
                p.setEstado(rs.getString("estado"));
               
                 
            }
        } catch (SQLException e) {
            System.out.println("Erro! CPF não encontrado");
            JOptionPane.showMessageDialog(null, "Erro! CPF naõ encontrado");
            e.printStackTrace();
        }

        return p;
    }
    
    public void aplicarVacinaUsuario(VacinaUsuario vacinausuario) {
    	
    	  try {
              this.con = Conexao.getInstance();

              String sql = "INSERT INTO vacina_aplicada VALUES (default,?,?,?,?,?)" ;
              PreparedStatement pstm = con.getConexao().prepareStatement(sql);
              
              	  //pstm.setInt(1, 1);
            	  pstm.setString(1, vacinausuario.getCpf());
            	  pstm.setString(2, vacinausuario.getImunobiologico());
            	  pstm.setDate(3, java.sql.Date.valueOf(vacinausuario.getDtaplicacao()));
            	  pstm.setDate(4, java.sql.Date.valueOf(vacinausuario.getDtproximaaplicacao()));
            	  
            	  pstm.setString(5, vacinausuario.getUfaplicacao());	
                  pstm.executeUpdate();

              	  System.out.println("Vacina Cadastrada!!");
              	  JOptionPane.showMessageDialog(null, "Vacina Cadastrada");

          } catch (SQLException e) {
              System.err.println("Erro ao cadastrar vacina");
              JOptionPane.showMessageDialog(null, "Erro ao cadastrar vacina");
              e.printStackTrace();
          }
	
    }
    
    public ArrayList<VacinaDTO> PesquisarVacina(String cpf){
    	ArrayList<VacinaDTO> lista =  new ArrayList<VacinaDTO>();
		try {
			
			this.con = Conexao.getInstance();
			String sql = "SELECT us.nomeCompleto,us.sexo, va.* FROM `vacina_aplicada` va\r\n" + 
						"INNER JOIN Usuario us\r\n" + 
						"on us.cpf = va.cpf WHERE us.cpf=?";
			
			PreparedStatement pstm = con.getConexao().prepareStatement(sql);
			pstm.setString(1, cpf);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
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
			
			
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao pesquisar Vacina:" + e);
		}
		
		return lista;
	}

}
