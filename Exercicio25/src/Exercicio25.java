import java.util.Scanner;

public class Exercicio25 {
    private static Integer[] contador = {0,0,0};
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String sair = "continue";
        do {
            sair = menu();
        }while (sair.equals("continue"));
    }

    private static String menu() {
        System.out.println("*-------------------------*");
        System.out.println("#   Contador de visitas   #");
        System.out.println("#       1 - Novo          #");
        System.out.println("#     2 - Atualizar       #");
        System.out.println("#       3 - Sobre         #");
        System.out.println("#       4 - Sair         #");
        System.out.println("*-------------------------*");
        System.out.print("Opção: ");
        short opcao = s.nextShort();

        String sair = contaVisitas(opcao);
        return sair;
    }

    static String contaVisitas(short opcao){
        switch (opcao){
            case 1:
                contador[0]++;
                break;
            case 2:
                contador[1]++;
                break;
            case 3:
                contador[2]++;
                break;
            default:
                return "sair";
        }

        limpaTela();

        System.out.println("Voce escolheu Novo: " + contador[0]);
        System.out.println("Voce escolheu Atualizar: " + contador[1]);
        System.out.println("Voce escolheu Sobre: " + contador[2]);
        System.out.println("\n");
        return "continue";
    }

    static void limpaTela(){
        for (int i=0; i < 40; i++)
            System.out.println();
    }

}
