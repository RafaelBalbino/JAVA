package exercicioHeranca;

public class Exercicio1Zoologico_Exe {

	public static void main(String[] args) {
		/* Classe desnecessária para o exercício 1 mas é sempre 
		 * bom testar se tudo está funcionando direitinho, né? */
		
		Exercicio1Cachorro_Sub cachorro = new Exercicio1Cachorro_Sub();
		Exercicio1Cavalo_Sub cavalo = new Exercicio1Cavalo_Sub();
		Exercicio1Preguica_Sub preguica = new Exercicio1Preguica_Sub();
		
		System.out.println("Venham, venham! Nossos queridos animais irão fazer "
			               + "suas apresentações! \n");
		
		cachorro.correr();
		cachorro.emitirSom();
		
		System.out.println();
		
		cavalo.galopar();
		cavalo.emitirSom();
		
		System.out.println();
		
		preguica.subirEmArvore();
		preguica.emitirSom();
		
		System.out.println("\nIsso é tudo pessoal! Amanhã tem mais!");
	}

}
