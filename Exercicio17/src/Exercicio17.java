import java.util.Scanner;

public class Exercicio17 {
	
    //--------Analiza expressao de chaves----------------

    public static void main(String[] args) {
        recebeValores();
    }

	private static void recebeValores() {
		Scanner s = new Scanner(System.in);
		String chaves;
		char[] pilha = new char[50];
		
		System.out.print("Digite uma sequencia de chaves Ex: {{}}{} : ");
        chaves = s.nextLine();

        for(int i=0; i < chaves.length(); i++){
        	pilha[i] = chaves.charAt(i);
        }
        
        if(testaPilha(pilha))
        	System.out.println("EXPRESSÃO CORRETA!!!");
        else
        	System.out.println("EXPRESSÃO INCORRETA");
	}

	private static boolean testaPilha(char[] pilha) {
		Integer contador = 0;
		for (int i = 0; i < pilha.length; i++) {
			if(pilha[i] == '{') contador++;
			else if(pilha[i] == '}') contador--;
		}
		
		if(contador == 0) return true;
		else return false;
	}
}