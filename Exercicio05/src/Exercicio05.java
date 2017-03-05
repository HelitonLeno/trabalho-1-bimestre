import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		imprimeEstadoNotas();		
	}
	
	static void imprimeEstadoNotas(){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite a m�dia final: ");
		double nota = in.nextDouble();
		
		System.out.println("Voc� est� " + resultadoNotas(nota));
	}
	
	static String resultadoNotas(double nota){
		if(nota >= 7) return "APROVADO";
		else if(nota >= 4 && nota < 7) return "EM EXAME";
		else return "REPROVADO";
	}
}