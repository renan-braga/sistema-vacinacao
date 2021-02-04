package br.edu.ifsp.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class VacinaUsuario {
	private int id;
	private String cpf;
	private String imunobiologico;
	private LocalDate dtaplicacao;
	private LocalDate dtproximaaplicacao;
	private String ufaplicacao;
	
	public VacinaUsuario() {
		
	}
	
	public VacinaUsuario(int id, String cpf, String imunobiologico, LocalDate dtaplicacao, LocalDate dtproximaaplicacao, String ufaplicacao ) {
		this.id = id;
		this.cpf = cpf;
		this.imunobiologico = imunobiologico;
		this.dtaplicacao = dtaplicacao;
		this.dtproximaaplicacao = dtproximaaplicacao;
		this.ufaplicacao = ufaplicacao;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getImunobiologico() {
		return imunobiologico;
	}
	public void setImunobiologico(String imunobiologico) {
		this.imunobiologico = imunobiologico;
	}
	public LocalDate getDtaplicacao() {
		return dtaplicacao;
	}
	public void setDtaplicacao(LocalDate dtaplicacao2) {
		this.dtaplicacao = dtaplicacao2;
	}
	public LocalDate getDtproximaaplicacao() {
		return dtproximaaplicacao;
	}
	public void setDtproximaaplicacao(LocalDate dtproximaaplicacao) {
		this.dtproximaaplicacao = dtproximaaplicacao;
	}
	public String getUfaplicacao() {
		return ufaplicacao;
	}
	public void setUfaplicacao(String ufaplicacao) {
		this.ufaplicacao = ufaplicacao;
	}
	/*
	 public String getDataFormatada() {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        return formatter.format(dtaplicacao);
	        
	    }
	 
	 public String getDataFormatada2() {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        return formatter.format(dtproximaaplicacao);
	 }
	*/
}
