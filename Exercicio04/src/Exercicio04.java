import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		imprimeExponencial();
	}

	static void imprimeExponencial(){
		Scanner s = new Scanner(System.in);

		System.out.println("Digite o numero: ");
		Integer numero = s.nextInt();

		System.out.println("O resultado de " + numero + " elevado a " + numero + " é: " + exponencial(numero,numero));
	}

	static Integer exponencial(Integer base, Integer exp){
		  Integer resultado = 1;
		  if (exp == 0) return 1;
		  for (int i = 1; i <= exp; i++) resultado*=base;
		  return resultado;
	}
}