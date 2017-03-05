import java.util.Scanner;

public class Exercicio08 {
	
	private static Scanner in = new Scanner(System.in);
	private static  double base = 0, altura = 0;
	
	public static void main(String[] args) {
		menu();
	}
	
	static void menu(){		
		System.out.println("Escolha uma opção: \n\n"
				+ "1 - Calcular área do Triângulo\n"
				+ "2 - Calcular área do Quadrado\n"
				+ "3 - Calcular área do Retângulo\n"
				+ "4 - Calcular área do Circulo\n"
				+ "5 - Calcular área do Trapézio");
		
		Integer opcao = in.nextInt();
		
		calculaOpcaoMenu(opcao);
	}

	static void calculaOpcaoMenu(Integer opcao) {		
		switch(opcao){
			case 1: 
				System.out.println("Área do tringulo é: " + calculaAreaTriangulo()); break;	
			case 2:
				System.out.println("Área do quadrado é: " + calculaAreaQuadrado()); break;
			case 3:
				System.out.println("Área do retangulo é: " + calculaAreaRetangulo());break;
			case 4: 
				System.out.println("Área do círculo é: " + calculaAreaCirculo()); break;
			case 5:
				System.out.println("Área do trapézio é: " + calculaAreaTrapezio()); break;
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
