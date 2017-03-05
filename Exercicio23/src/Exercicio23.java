public class Exercicio23 {

    public static void main (String[]args){
        Integer[][] matriz = new Integer[10][10];
        Integer counter = 1;

        //Preenchendo matriz com inteiros de 1 a 100
        for (int i = 0; i < matriz.length; i++){
            for (int j=0; j < matriz.length; j++){
                matriz[i][j] = counter;
                counter++;
            }
        }

        copiaMatriz(matriz);
    }

    private static void copiaMatriz(Integer[][] matriz) {
        Integer[][] copiaMatriz = new Integer[10][10];

        for (int i = 0; i < matriz.length; i++){
            for (int j=0; j < matriz.length; j++){
                copiaMatriz[i][j] = matriz[i][j];

                if (copiaMatriz[i][j] < 10)
                    System.out.print("0" + copiaMatriz[i][j] + "   ");
                else
                    System.out.print(copiaMatriz[i][j] + "   ");
            }
            System.out.println();
        }
    }
}