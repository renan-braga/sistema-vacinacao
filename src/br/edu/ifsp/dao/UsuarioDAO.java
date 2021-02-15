package br.edu.ifsp.dao;

import br.edu.ifsp.conexao.Conexao;
import br.edu.ifsp.dto.VacinaDTO;
import br.edu.ifsp.modelo.Usuario;
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
			JOptionPane.showMessageDialog(null, "Usuário inserido");

		} catch (Exception e) {
			System.err.println("Erro,ao inserir um usuário");
			JOptionPane.showMessageDialog(null, "Erro ao inserir um usuário");
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
}
