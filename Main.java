package br.com.ufc.projeto;

public class Main {

	public static void main(String[] args) {
		Gerente gerente1 = new Gerente();
		Programador programador1 = new Programador();
		Pesquisador pesquisador1 = new Pesquisador();
		Programador programador2 = new Programador();
		Pesquisador pesquisador2 = new Pesquisador();
		
		programador1.setNome("Junin");
		programador2.setNome("Rodrigagem");
		pesquisador1.setNome("Josicleidisonn");
		pesquisador2.setNome("Facebuckssonn");
		
		Projeto projeto1 = new Projeto();
		projeto1.setGerenteDeProjeto(gerente1);
		
		gerente1.setProjeto(projeto1);
		
		gerente1.contratarProgramador(programador1);
		gerente1.contratarPesquisador(pesquisador1);
		System.out.println(projeto1.getProgramador());
		gerente1.contratarProgramador(programador2);
		System.out.println(projeto1.getProgramador());
		gerente1.demitirProgramador();
		System.out.println(projeto1.getProgramador());
		gerente1.contratarProgramador(programador2);
		System.out.println(projeto1.getProgramador());
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println(projeto1.getPesquisador());
		gerente1.contratarPesquisador(pesquisador2);
		System.out.println(projeto1.getPesquisador());
		gerente1.demitirPesquisador();
		System.out.println(projeto1.getPesquisador());
		gerente1.contratarPesquisador(pesquisador2);
		System.out.println(projeto1.getPesquisador());
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		programador2.Programar();
		pesquisador2.Pesquisar();
		
		
		
		
		
		
		
	

	}

}
