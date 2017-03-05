import java.util.Scanner;

public class Exercicio08 {
	
	private static Scanner in = new Scanner(System.in);
	private static  double base = 0, altura = 0;
	
	public static void main(String[] args) {
		menu();
	}
	
	static void menu(){		
		System.out.println("Escolha uma op��o: \n\n"
				+ "1 - Calcular �rea do Tri�ngulo\n"
				+ "2 - Calcular �rea do Quadrado\n"
				+ "3 - Calcular �rea do Ret�ngulo\n"
				+ "4 - Calcular �rea do Circulo\n"
				+ "5 - Calcular �rea do Trap�zio");
		
		Integer opcao = in.nextInt();
		
		calculaOpcaoMenu(opcao);
	}

	static void calculaOpcaoMenu(Integer opcao) {		
		switch(opcao){
			case 1: 
				System.out.println("�rea do tringulo �: " + calculaAreaTriangulo()); break;	
			case 2:
				System.out.println("�rea do quadrado �: " + calculaAreaQuadrado()); break;
			case 3:
				System.out.println("�rea do retangulo �: " + calculaAreaRetangulo());break;
			case 4: 
				System.out.println("�rea do c�rculo �: " + calculaAreaCirculo()); break;
			case 5:
				System.out.println("�rea do trap�zio �: " + calculaAreaTrapezio()); break;
			default:
				System.out.println("Opcao invalida!");
		}	
	}
	
	static double calculaAreaTriangulo(){
		System.out.print("Digite a base");
		base = in.nextDouble();
		
		System.out.println("Digite a altura");
		altura = in.nextDouble();
		
		return (base * altura) / 2;
	}
	
	static double calculaAreaQuadrado(){
		System.out.print("Digite o lado do quadrado: ");
		double base = in.nextDouble();
				
		return base * base;
	}
	
	static double calculaAreaRetangulo(){
		System.out.print("Digite a base");
		base = in.nextDouble();
		
		System.out.println("Digite a altura");
		altura = in.nextDouble();
		
		return base * altura;
	}
	
	static double calculaAreaCirculo(){
		System.out.print("Digite a raio");
		base = in.nextDouble();
		
		return Math.PI * base * base;
	}
	
	static double calculaAreaTrapezio(){
		System.out.print("Digite a base Maior");
		base = in.nextDouble();
		
		System.out.println("Digite a base Menor");
		double baseMenor = in.nextDouble();
		
		System.out.println("Digite a altura");
		altura = in.nextDouble();
		
		return base + ((baseMenor) / 2) * altura;
	}
}
