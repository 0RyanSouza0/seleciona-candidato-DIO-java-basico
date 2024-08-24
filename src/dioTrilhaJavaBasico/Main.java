package dioTrilhaJavaBasico;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProcessoSeletivo candidato=new ProcessoSeletivo();
		
		//ACONSELHO TESTAR UM POR VEZ

		System.out.println("-----ANALISA CANDIDATO----");
		candidato.analisaSalario(0);
		
		System.out.println(" ");
		
		System.out.println("-----------SELECIONA CANDIDATOS-----------");
		candidato.selecionaCandidato(0);
		
		System.out.println(""); 
				
		System.out.println("----------ENTRA EM CONTATO COM CANDIDATOS-------");
		String [] candidatosSelecionados= {"RYAN","PAULO","AUGUSTO","MENEZES","OTAVIO"};
		candidato.entrarContatoCandidato(candidatosSelecionados);
		System.out.println(""); 
		
		
		System.out.println("-----------IMPRIMI CANDIDATOS SELECIONADOS--------");
		candidato.imprimiCandidatosSelecionados();;
		
	}

}
