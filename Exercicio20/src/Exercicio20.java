import java.util.Scanner;

public class Exercicio20 {

    //Define array e preenche com numeros inteiros

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o numero de linhas da matriz: ");
        Integer linhas = in.nextInt();

        System.out.print("Digite o numero de colunas: ");
        Integer colunas = in.nextInt();

        Integer[][] matriz = new Integer[linhas][colunas];

        preencheMatriz(linhas, colunas, matriz);

        for (int i=0; i < linhas; i++){
            for (int j=0; j < colunas; j++){
                if (matriz[i][j] < 10)
                    System.out.print("0"+matriz[i][j] + "    ");
                else
                    System.out.print(matriz[i][j] + "    ");
            }
            System.out.println();
        }
    }

    private static Integer[][] preencheMatriz(Integer linhas, Integer colunas, Integer[][] matriz) {
        Integer count = 1;

        for (int i=0; i < linhas; i++){
            for (int j=0; j < colunas; j++){
                    matriz[i][j] = count;
                    count++;
            }
        }
        return matriz;
    }
}