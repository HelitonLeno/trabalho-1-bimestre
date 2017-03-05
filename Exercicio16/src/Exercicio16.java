import java.util.Scanner;

public class Exercicio16 {

	private static Scanner in;
    private static String[] nome = new String[10];
    private static Integer count = 0;

    public static void main(String[] args) { cadastroClientes(); }

    private static void cadastroClientes() {
        switch (menu()){
            case 1:
                novo(); break;
            case 2:
                mostrar(); break;
            default:
                System.out.println("Opcao invalida");
        }
    }

    private static void mostrar() {
        System.out.println("---- Contatos ----");
        for (int i = 0; i <nome.length; i++){
            if (nome[i] == null) continue;
            System.out.println(nome[i]);
        }

        System.out.println("\nDeseja voltar ao menu? S/N");
        String voltarMenu = in.next();

        if (voltarMenu.toUpperCase().equals("S")) cadastroClientes();
        else if (voltarMenu.toUpperCase().equals("N"));
    }

    private static void novo() {
        in = new Scanner(System.in);

        if (count > 9){
            System.out.println("Espaço insuficiente.");
        }else {
            System.out.print("Digite o nome: ");
            nome[count] = in.nextLine();

            count++;

            System.out.println("Deseja adicionar outro? S/N");
            String novoContato = in.next();

            if (novoContato.toUpperCase().equals("S")) novo();
            else if (novoContato.toUpperCase().equals("N")) cadastroClientes();
        }

    }

    private static short menu() {
        in = new Scanner(System.in);

        System.out.println("#..............................#");
        System.out.println("#.......... CADASTRO ..........#");
        System.out.println("#..............................#");
        System.out.println("#.......... 1 - Novo ..........#");
        System.out.println("#.......... 2 - Mostrar .......#");
        System.out.println("#..............................#");

        System.out.print("Opção: ");
        short opcao = in.nextShort();
        
        System.out.println("\n\n");

        return opcao;
    }

}
