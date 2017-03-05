import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		estadoLogin();
	}
	
	static void estadoLogin(){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite o usuario: ");
		String user = in.nextLine();
		
		System.out.print("Digite a senha: ");
		String passwd = in.nextLine();
		
		System.out.println(testaLogin(user, passwd));
	}
	
	static String testaLogin(String user, String passwd){
		if(user.equals("admin") && passwd.equals("admin"))
			return "Login efetuado com sucesso!";
		else 
			return "Usuário e/ou senha incorretos";
	}
	
}
