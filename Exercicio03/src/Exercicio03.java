import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		imprimeExp();
	}

	static void imprimeExp(){
		Scanner s = new Scanner(System.in);

		System.out.println("Digite o numero: ");
		Integer numero = s.nextInt();

		System.out.println("O resultado de " + numero + " elevado a 2 é: " + exponencial(numero));
	}

	static Integer exponencial(Integer n1){
		return n1 * n1;
	}
}