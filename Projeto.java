package br.com.ufc.projeto;

public class Projeto {
	private String nomeProjeto;
	private String dataInicio;
	private Double orçamento;
	private Gerente gerenteDeProjeto;
	private Programador programador;
	private Pesquisador pesquisador;
	public String getNomeProjeto() {
		return nomeProjeto;
	}
	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Double getOrçamento() {
		return orçamento;
	}
	public void setOrçamento(Double orçamento) {
		this.orçamento = orçamento;
	}
	public Gerente getGerenteDeProjeto() {
		return gerenteDeProjeto;
	}
	public void setGerenteDeProjeto(Gerente gerenteDeProjeto) {
		this.gerenteDeProjeto = gerenteDeProjeto;
	}
	public Programador getProgramador() {
		return programador;
	}
	public void setProgramador(Programador programador) {
		this.programador = programador;
	}
	public Pesquisador getPesquisador() {
		return pesquisador;
	}
	public void setPesquisador(Pesquisador pesquisador) {
		this.pesquisador = pesquisador;
	}
	
	
	
	

}
