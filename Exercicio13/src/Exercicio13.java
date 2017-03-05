//Imprime um menu com minimo 5 opçoes

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        String[] menu = pegarMenuDigitado();

        imprimeMenu(menu);
    }

    private static String[] pegarMenuDigitado() {
        Scanner in = new Scanner(System.in);
        short sizeMenu = 0;

        try {
            //Não pode digitar letras...... ¬¬
            System.out.println("** Digite quantos itens terá o menu, minimo 5 opções. **");
            sizeMenu = in.nextShort();

        } catch (InputMismatchException e){
            System.out.println("Apenas numeros inteiros, finalizando...");
            System.exit(0);
        }
        
        String[] menu = new String[sizeMenu];
        for (int i=0; i < menu.length; i++){
            System.out.println("Digite o nome do "+ (i+1) + "º item do menu: ");
            menu[i] = in.next();
        }
        
        return menu;
    }

    static void imprimeMenu(String[] menu){
        System.out.println("######################");

        for (int i=0; i < menu.length; i++){
            System.out.println("  " + (i+1) + " - " + menu[i]);
        }

        System.out.println("######################");
    }
}