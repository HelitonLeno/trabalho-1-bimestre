public class Exercicio22 {

    public static void main(String[] args) {
        Integer[] vetor = new Integer[50];

        //Preenchendo vetor com inteiros de 1 a 50
        for (int i=0; i < vetor.length; i++)
            vetor[i] = i+1;

        copiaVetor(vetor);
    }

    private static void copiaVetor(Integer[] vetor) {
        Integer[] copiaVetor = new Integer[50];

        for (int i=0; i < vetor.length; i++){
            copiaVetor[i] = vetor[i];
            System.out.println(copiaVetor[i]);
        }
    }
}