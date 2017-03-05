import java.util.Scanner;

public class Exercicio09{
	
	public static void main(String[] args) {
		tipoTriangulo();
	}
	
	static void tipoTriangulo(){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite primeiro lado: ");
		Integer ladoUm = in.nextInt();
		
		System.out.print("Digite segundo lado: ");
		Integer ladoDois = in.nextInt();
		
		System.out.print("Digite terceiro lado: ");
		Integer ladoTres = in.nextInt();
		
		System.out.println(descobreTriangulo(ladoUm, ladoDois, ladoTres));
	}

	private static String descobreTriangulo(Integer ladoUm, Integer ladoDois, Integer ladoTres) {
		if(ladoUm == ladoDois && ladoUm !=ladoTres ||
				ladoUm == ladoTres && ladoUm != ladoDois ||
				ladoDois == ladoTres && ladoDois != ladoUm)
			return "Triângulo isósceles";
		
		if(ladoUm == ladoDois && ladoUm == ladoTres)
			return "Triângulo equilátero";
		
		else
			return "Triângulo escaleno";
		
	}
}