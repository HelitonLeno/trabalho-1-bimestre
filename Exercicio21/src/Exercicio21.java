public class Exercicio21 {

    public static void main(String[] args) {
        Integer [][][][] matriz = new Integer[10][10][10][10];
        Integer count = 1;

        for (int i=0; i < 10; i++){
            for (int j=0; j < 10; j++){
                for (int k=0; k < 10; k++){
                    for (int l=0; l < 10; l++){
                        matriz[i][j][k][l] = count;
                        count++;
                        System.out.print(matriz[i][j][k][l] + "    ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
