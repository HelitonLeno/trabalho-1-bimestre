import java.util.Scanner;

public class Exercicio19 {

    //Alterar login e senha padrao, retornando vetor com dados atualizados

    public static void main(String[] args) {
        String[] loginSenha = new String[3];

        loginSenha[0] = "root";
        loginSenha[1] = "admin";

        System.out.println("Login: root / Senha: admin");
        System.out.println("Alterar login e senha padrão");

        alterarSenha(loginSenha);

        if(!loginSenha[2].equals("0")){
            System.out.println("\nLogin e senha alterados com sucesso!");
            System.out.println("\nSeu novo login: " + loginSenha[0]);
            System.out.println("Sua nova senha: " + loginSenha[1]);

        }else{
            System.out.println("Senha incorreta, encerrando...");
        }
    }

    private static String[] alterarSenha(String[] loginSenha) {
        Scanner s = new Scanner(System.in);

        System.out.println("Confirme sua senha para prosseguir");
        String senha = s.nextLine();

        if(senha.equals("admin")){
            System.out.print("\nDigite o novo login: ");
            loginSenha[0] = s.nextLine();

            System.out.print("Digite a nova senha: ");
            loginSenha[1] = s.nextLine();

            loginSenha[2] = "1";
        }else {
            loginSenha[2] = "0";
        }

        return loginSenha;
    }
}
