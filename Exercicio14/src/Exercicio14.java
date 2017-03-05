import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio14 {
		private static Scanner in = new Scanner(System.in);
		private static double n1, n2;
		
		public static void main(String[] args) {
			menu();
		}
	
	static void menu(){
		System.out.println("=======================================================");
		System.out.println("|================  1 - Adição        =================|");
		System.out.println("|================  2 - Subtração     =================|");
		System.out.println("|================  3 - Multiplicação =================|");
		System.out.println("|================  4 - Divisão       =================|");
		System.out.println("|================  5 - Fatorial      =================|");
		System.out.println("|================  6 - Exponencial   =================|");
		System.out.println("=======================================================");
		System.out.println();
		System.out.print("Escolha uma opção: ");
		
		try{
		Integer opcao= in.nextInt();
		calculadora(opcao);
		
		}catch(InputMismatchException e){
			System.out.println("Apenas numeros inteiros, finalizando...");
			System.exit(0);
		}
	}

	private static void calculadora(Integer opcao) {
		switch(opcao){
			case 1:
				System.out.println("Resultado: " + adicao()); break;
			case 2:
				System.out.println("Resultado: " + subtracao()); break;
			case 3:
				System.out.println("Resultado: " + multi()); break;
			case 4:
				System.out.println("Resultado: " + divisao()); break;
			case 5:
				Integer n1 = (int) valor1();
				System.out.println("Resultado: " + fatorial(n1)); break;
			case 6:
				System.out.println("Resultado: " + exp()); break;
			default:
				System.out.println("Opcao invalida!");		
				for (int i = 0; i < 10; i++) 
					System.out.println();
				menu();
		}
	}
	
	//---- Potencia ----
	private static Integer exp(){
		System.out.print("Digite a base: ");
		Integer base = in.nextInt();
		
		System.out.print("Digite o expoente: ");
		Integer pot = in.nextInt();
		
		Integer resultado = 1;
		if (pot == 0) return 1;
		  for (int i = 1; i <= pot; i++) resultado*=base;
		  return resultado;
	}
	
	//---- Fatorial ----
	private static Integer fatorial(Integer n1){
		if(n1 == 1) return 1;
		if(n1 == 0) return 0;
		else return n1 * fatorial(n1 - 1);
	}
	
	private static double divisao(){
		n1 = valor1();
		n2 = valor2();
		
		return n1/n2;	
	}

	private static double multi(){
		n1 = valor1();
		n2 = valor2();
		return n1 * n2;
	}

	private static double subtracao(){
		n1 = valor1();
		n2 = valor2();
		return n1 - n2;
	}
	
	private static double adicao(){
		n1 = valor1();
		n2 = valor2();
		return n1 + n2;
	}
	
	private static double valor1(){
		System.out.println("Digite um valor");
		n1 = in.nextDouble();
		return n1;
	}
	
	private static double valor2(){
		System.out.println("Digite outro valor");
		n2 = in.nextDouble();
		return n2;
	}
}
