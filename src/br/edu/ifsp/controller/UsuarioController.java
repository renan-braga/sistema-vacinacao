package br.edu.ifsp.controller;

import java.util.ArrayList;

import br.edu.ifsp.dao.UsuarioDAO;
import br.edu.ifsp.modelo.Usuario;

public class UsuarioController {
	
	private UsuarioDAO usuarioDao;
	
	public UsuarioController() {
		usuarioDao = new UsuarioDAO();
	}

	public ArrayList<Usuario> consultarTodos() {
		return usuarioDao.consultarTodos();
	}

	public void cadastrarUsuario(Usuario u) {
		usuarioDao.cadastrarUsuario(u);
	}

	public void removerUsuarioCPF(Usuario u) {
		usuarioDao.removerUsuarioCPF(u);
		
	}

	public Usuario consultarUsuarioCPF(String flagCPF) {
		return usuarioDao.consultarUsuarioCPF(flagCPF);
	}

	public void updateUsuarioCPF(Usuario u) {
		usuarioDao.updateUsuarioCPF(u);
	}

}
