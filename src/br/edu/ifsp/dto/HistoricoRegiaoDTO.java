package br.edu.ifsp.dto;

public class HistoricoRegiaoDTO {
	private String regiao;
	private String imunobiologico;
	private String total;
	
	public HistoricoRegiaoDTO() {
		
	}
	
	public HistoricoRegiaoDTO(String regiao, String imunobiologico, String total) {
		this.regiao = regiao;
		this.imunobiologico = imunobiologico;
		this.total = total;
	}
	
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public String getImunobiologico() {
		return imunobiologico;
	}
	public void setImunobiologico(String imunobiologico) {
		this.imunobiologico = imunobiologico;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	
	
	
}
