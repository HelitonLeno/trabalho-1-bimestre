import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		dadosTriangulo();
	}

	private static void dadosTriangulo() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite primeiro lado: ");
		Integer ladoUm = in.nextInt();
		
		System.out.print("Digite segundo lado: ");
		Integer ladoDois = in.nextInt();
		
		System.out.print("Digite terceiro lado: ");
		Integer ladoTres = in.nextInt();
		
		testeFormaTriangulo(ladoUm, ladoDois, ladoTres);
	}

	private static void testeFormaTriangulo(Integer ladoUm, Integer ladoDois, Integer ladoTres) {
		if (ladoUm < (ladoDois + ladoTres) &&(ladoDois < (ladoUm + ladoTres) && 
				(ladoTres < (ladoDois + ladoUm)))){
			System.out.println("\nPode formar um TRIANGULO");
			
		}else{
			System.out.println("NAO pode formar um TRIANGULO");
		}
	}
}