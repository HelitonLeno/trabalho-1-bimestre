import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio15 {	

	private static Scanner in = new Scanner(System.in);
	private static String[] nome = new String[10];
	private static String[] telefone = new String[10];
	private static String[] email = new String[10];
	private static Integer count = 0;

	public static void main(String[] args) {
		cadastroClientes();
	}

	private static void cadastroClientes() {
		System.out.println("=======================================================");
		System.out.println("|================  CADASTRO CLIENTE  =================|");
		System.out.println("|=====================================================|");
		System.out.println("|================    1 - Novo        =================|");
		System.out.println("|================    2 - Mostrar     =================|");
		System.out.println("=======================================================");
		
		Integer opcao = 0;
		
		try{
			System.out.print("Escolha uma opção: ");
			opcao = in.nextInt();
		
		}catch(InputMismatchException e){
			System.out.println("Apenas opção 1 ou 2, finalizando...");
			System.exit(0);
		}
		System.out.print("\n\n\n\n");
		
		switch (opcao){
		case 1:
			novo(); break;
		case 2:
			mostrarClientes(); break;
		default:
			System.out.println("Opção invalida!");
			cadastroClientes();
		}
	}

	// ============ "Mostra dados organizados, colocando espaços para centralizar" ==============
	private static void mostrarClientes() {
		System.out.println("ID - Nome -------------------- Telefone --------- E-mail --------------");
		for (int i=0; i < nome.length; i++){
			if (nome[i] == null) continue;
			System.out.print("0" + (i+1) +"   "+ nome[i]);

			for (int j = 0; j <= (25 - nome[i].length()); j++) System.out.print(" "); // percorrer linhas
			System.out.print(telefone[i]);

			for (int k = 0; k < (19 - telefone[i].length()); k++) System.out.print(" ");
			System.out.print(email[i]);

			System.out.println();
		}
		System.out.println("\n");
		
		System.out.println("Voltar ao menu? S/N");
		String option = in.next();
		
		if (option.toLowerCase().equals("s")) {
			cadastroClientes();
		}else if (option.toLowerCase().equals("n")) {
			System.out.println("Finalizando...");
			System.exit(0);
		}else{
			System.out.println("Entrada invalida.");
		}
		
	}
	
	//Novo cliente..
	private static void novo() {
		if (count > 9){
			System.out.println("Espaço insuficiente!!!");
			System.out.print("\n\n");
			cadastroClientes();

		} else {
			System.out.print("Digite o nome: ");
			nome[count] = in.nextLine();
			if (nome[count].equals("")) nome[count] = in.nextLine();

			System.out.print("Digite o telefone: ");
			telefone[count] = in.nextLine();

			System.out.print("Digite o email: ");
			email[count] = in.nextLine();

			if (nome[count].equals("")) {
				System.out.println("\nNome nao pode ser vazio\n\n");
				novo();
			}

			if (telefone[count].equals(""))
				telefone[count] = "***";

			if (email[count].equals(""))
				email[count] = "***";

			count++;

			System.out.println("\n\n\n\n");
			cadastroClientes();
		}

	}
}
