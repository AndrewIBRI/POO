package br.com.ufc.projeto;

public class Funcionario {
	private String nome;
	private String cpf;
	private String dataNascimento;
	private String rg;
	private String dataDeEntrada;
	private double salario;
	
	
	public String getNome() {
		return nome;
	}
	@Override
	public String toString() {
		return "nome: " + nome + ", CPF:" + cpf + ", Data De Nascimento: " + dataNascimento + ", RG: " + rg
				+ ", Data De Entrada: " + dataDeEntrada + ", salario: " + salario;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDataDeEntrada() {
		return dataDeEntrada;
	}
	public void setDataDeEntrada(String dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	

}
