package dioTrilhaJavaBasico;

import java.util.Random;
import java.util.Scanner;

public class ProcessoSeletivo {

	private double SalarioPretendido;

	

	public double getSalarioPretendido() {
		return SalarioPretendido;
	}

	public void setSalarioPretendido(double salarioPretendido) {
		SalarioPretendido = salarioPretendido;
	}
	
	
	
	public static void analisaSalario(double salarioPretendido) {
		
		final double SALARIO_BASE=2000.0;
		
		if(SALARIO_BASE <=salarioPretendido ) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}
		else if(SALARIO_BASE == salarioPretendido ) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		}
		else {
			System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
		}
		
	}
	
	public static void selecionaCandidato(double salarioPretendido) {
		final double SALARIO_BASE=2000.0;
		Scanner ler= new Scanner(System.in);
		ProcessoSeletivo nomeCandidato= new ProcessoSeletivo();
		String[] candidatos= {"RYAN","ANA","JULIO","PAULA","OTAVIO","AUGUSTO","FRANCISCO"};
		int candidatosSelecionados;
		int candidatoAtual;
		candidatoAtual=0;
		candidatosSelecionados=0;
		try {
			while (candidatosSelecionados<5) {
				System.out.println("Digite o Salario Pretendido: ");
				salarioPretendido=ler.nextDouble();
				String candidato = candidatos[candidatoAtual ];
				System.out.println("O candidato "+ candidato +" solicitou este valor: "+salarioPretendido);
				if(salarioPretendido<=SALARIO_BASE) {
					System.out.println("O candidato "+ candidato + " foi selecionado(a) para a vaga.");
					
					candidatosSelecionados++;
					
				}
				else {
					
					System.out.println("O candidato "+ candidato +" não foi selecionado(a) para a vaga");
					
				}
				candidatoAtual++;
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("O numero de candidatos acabou.  " + e);
		}
		
	}
	
	
	public void imprimiCandidatosSelecionados( ) {
		String [] candidatosSelecionados= {"RYAN","PAULO","AUGUSTO","MENEZES","OTAVIO"};
		
		System.out.println("CANDIDATOS SELECIONADOS");
		for(String c:candidatosSelecionados) {
			System.out.println(c);
		}
		

		
	}
	
	//METEDO AUXILIAR
	
	public static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	public void entrarContatoCandidato(String[] candidatosSelecionados) {
		
		
		int tentativasRealizadas=1;
		boolean continuarTentando=true;
		boolean atendeu=false;
		while(tentativasRealizadas<3 && continuarTentando) {
			
			atendeu=atender();
			continuarTentando= !atendeu;
			if(continuarTentando) {
				tentativasRealizadas++;
			}
			else {
				System.out.println("Contato Realizado.");
			}
			
		}
		
		if(atendeu) {
			System.out.println("CONSEGUIMOS CONTATO COM ESSES CANDIDATOS: " );
			for (String c: candidatosSelecionados) {
				System.out.println(c +"NA TENTATIVA NUMERO "+ tentativasRealizadas ) ;
			}
			
		}
		else {
			
			System.out.println("NÃO CONSEGUIMOS CONTATO COM ESSES CANDIDATOS: " );
			for (String c: candidatosSelecionados) {
				System.out.println(c +" TENTATIVA EXCEDIDA") ;
			}
			
		}
	}
	
}
