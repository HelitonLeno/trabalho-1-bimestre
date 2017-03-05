import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        imprimeSoma();
    }

    static void imprimeSoma() {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite primeiro numero: ");
        double numeroUm = s.nextDouble();

        System.out.println("Digite segundo numero: ");
        double numeroDois = s.nextDouble();

        System.out.println("O resultado da soma �: " + somar(numeroUm, numeroDois));
    }

    static double somar(double n1, double n2) {
        return n1 + n2;
    }
}