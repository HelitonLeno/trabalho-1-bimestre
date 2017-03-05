import java.util.Scanner;

public class Exercicio18 {
    //Numeros impressos em formato matriz

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer[][] numeros = new Integer[3][3];
        short contador = 1;

        System.out.println("Digite 9 numeros e veja como ficaria em uma matriz 3x3: ");

        for (int i=0; i < 3; i++){
            for (int j=0; j < 3; j++ ){
                System.out.print(contador + ": ");
                numeros[i][j] = s.nextInt();
                contador++;
            }
        }

        imprimeMatriz(numeros);
    }

    private static void imprimeMatriz(Integer[][] numeros) {
        for (int i=0; i < 3; i++){
            for (int j=0; j < 3; j++ ){
            	if(numeros[i][j] > 10 )
            		System.out.print(numeros[i][j] + "     ");
            	else 
            		System.out.print(numeros[i][j] + "      ");
            }
            System.out.println("\n");
        }
    }
}
