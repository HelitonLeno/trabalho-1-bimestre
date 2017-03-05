import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		imprimeMult();
	}

	static void imprimeMult(){
		Scanner s = new Scanner(System.in);

		System.out.println("Digite primeiro numero: ");
		double numeroUm = s.nextDouble();

		System.out.println("Digite segundo numero: ");
		double numeroDois = s.nextDouble();

		System.out.println("O resultado da multiplicação é: " + multi(numeroUm, numeroDois));
	}

	static double multi(double n1, double n2){
		return n1 * n2;
	}
}