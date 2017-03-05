import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {		
		login();		
	}
	
	static void login(){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite o seu login: ");
		String login = in.nextLine();
		
		System.out.println("Login: " + testaLogin(login));
	}
	
	static boolean testaLogin(String login){
		if(login.equals("admin")) return true;
		else return false;
	}

}
