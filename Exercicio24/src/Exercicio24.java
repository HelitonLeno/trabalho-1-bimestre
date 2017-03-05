import java.util.Scanner;

public class Exercicio24 {

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
            case 3:
                alterar(); break;
            case 4:
                System.out.println("Encerrando..."); break;
            default:
                System.out.println("Opcao invalida");
        }
    }

    private static void alterar() {
        limpaTela();

        System.out.println("ID  ---- Contatos ----");
        for (int i = 0; i < nome.length; i++){
            if (nome[i] == null) continue;
            System.out.println(i + "   " + nome[i]);
        }

        System.out.print("\nDigite o ID que deseja alterar: ");
        short id = in.nextShort();

        if (id < 10 && !(nome[id] == null)){
            in = new Scanner(System.in);
            System.out.print("Informe o novo nome: ");
            nome[id] = in.nextLine();
        }else{
            System.out.println("ID Invalido!!!");
        }

        System.out.println("\n\n");
        cadastroClientes();
    }

    private static void mostrar(){
        limpaTela();

        System.out.println("ID  ---- Contatos ----");
        for (int i = 0; i < nome.length; i++){
            if (nome[i] == null) continue;
            System.out.println(i + "   " + nome[i]);
        }

        System.out.println("\nDeseja voltar ao menu? S/N");
        String voltarMenu = in.next();

        if (voltarMenu.toUpperCase().equals("S")){
            limpaTela();
            cadastroClientes();
        }
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

            if (novoContato.toUpperCase().equals("S")){
                novo();
            }
            else if (novoContato.toUpperCase().equals("N")){
                limpaTela();
                cadastroClientes();
            }
        }
    }

    private static short menu() {
        in = new Scanner(System.in);

        System.out.println("################################");
        System.out.println("#.......... Cadastro ..........#");
        System.out.println("#..............................#");
        System.out.println("#.......... 1 - Novo ..........#");
        System.out.println("#.......... 2 - Mostrar .......#");
        System.out.println("#.......... 3 - Alterar .......#");
        System.out.println("#.......... 4 - Sair ..........#");
        System.out.println("################################");

        System.out.print("Opção: ");
        short opcao = in.nextShort();

        System.out.println("\n");

        return opcao;
    }

    static void limpaTela(){
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}