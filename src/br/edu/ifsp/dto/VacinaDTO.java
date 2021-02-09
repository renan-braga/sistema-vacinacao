package br.edu.ifsp.dto;

import br.edu.ifsp.modelo.VacinaUsuario;

public class VacinaDTO extends VacinaUsuario {
	    private String nomeUsuario;
	    private String sexoUsuario;
	    private String CPFUsuario;
	    
	   public VacinaDTO() {
		   
	   }

		public String getNomeUsuario() {
			return nomeUsuario;
		}
		public void setNomeUsuario(String nomeUsuario) {
			this.nomeUsuario = nomeUsuario;
		}
		public String getSexoUsuario() {
			return sexoUsuario;
		}
		public void setSexoUsuario(String sexoUsuario) {
			this.sexoUsuario = sexoUsuario;
		}
		public String getCPFUsuario() {
			return CPFUsuario;
		}
		public void setCPFUsuario(String cPFUsuario) {
			CPFUsuario = cPFUsuario;
		}
	    
}
