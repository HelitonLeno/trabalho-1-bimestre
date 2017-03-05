import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio12 {
	
	public static void main(String[] args) {
		
		System.out.println("O resultado da soma é: " + somaVetor());
	}

	private static Integer somaVetor() {
		Scanner in = new Scanner(System.in);
		Integer[] vetor = new Integer[10];
		Integer soma = 0;
		
		try{
			for (int i = 0; i < vetor.length; i++) {
				System.out.print("Digite o "+ (i+1) + "º valor: ");
				vetor[i] = in.nextInt();
				soma += vetor[i];
			}
			
		} catch (InputMismatchException e) {
			System.out.println("- - - Apenas numeros inteiros. - - -");
			System.exit(0);
		}
		
		return soma;
	}
}