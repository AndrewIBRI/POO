package br.com.ufc.projeto;

public class Gerente extends Funcionario{
	private Projeto projeto;
	
	public void contratarProgramador(Programador x) {
		if (this.projeto.getProgramador() == null) {
			this.projeto.setProgramador(x);
		
		}else 
			System.out.println("O projeto já possui 1 Programador");
		}
			
	public void contratarPesquisador(Pesquisador y) {
		if (this.projeto.getPesquisador() == null) {
			this.projeto.setPesquisador(y);
		}
		else {
			System.out.println("O projeto já possui 1 Pesquisador");
		}
	}
	public void demitirProgramador() {
		this.projeto.setProgramador(null);
	}
	public void demitirPesquisador() {
		this.projeto.setPesquisador(null);
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	
}
