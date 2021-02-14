package br.edu.ifsp.controller;

import java.util.ArrayList;

import br.edu.ifsp.dao.VacinaUsuarioDAO;
import br.edu.ifsp.dto.HistoricoRegiaoDTO;
import br.edu.ifsp.dto.VacinaDTO;
import br.edu.ifsp.modelo.VacinaUsuario;

public class VacinaUsuarioController {
	
    private VacinaUsuarioDAO vacinaUsuarioDAO;

    public VacinaUsuarioController() {
    	vacinaUsuarioDAO = new VacinaUsuarioDAO();
    }

	public ArrayList<HistoricoRegiaoDTO> listarHistorico(String imunobiologico) {
		return vacinaUsuarioDAO.listarHistorico(imunobiologico);
		
	}

	public void aplicarVacinaUsuario(VacinaUsuario vacinaUsuario) {
		vacinaUsuarioDAO.aplicarVacinaUsuario(vacinaUsuario);
	}

	public ArrayList<VacinaDTO> pesquisarVacina(String text) {
		return vacinaUsuarioDAO.pesquisarVacina(text);
	}

}
