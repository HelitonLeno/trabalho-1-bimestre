import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        recebeMes();
    }

    private static void recebeMes() {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a data no formato: dd/MM/yyyy");
        String dataUsuario = s.nextLine();

        //Caso a validação retorne true
        if (validarData(dataUsuario)){
            imprimeMesExtenso(dataUsuario);
        }
    }

    private static void imprimeMesExtenso(String dataUsuario) {
        char[] charData = new char[10];
        for (int i=0; i < 10; i++){
            charData[i] = dataUsuario.charAt(i);
        }
        String mesCompleto = charData[3] + "" + charData[4];
        String dataCompleta = charData[0]+""+charData[1];
        String anoCompleto = charData[6]+""+charData[7]+""+charData[8]+""+charData[9];

        Integer mesInteger = Integer.valueOf(mesCompleto);
        String mesConvertidoExtenso = mesExtenso(mesInteger);

        System.out.println(dataCompleta + " de " + mesConvertidoExtenso + " de " + anoCompleto);
    }

    private static boolean validarData(String dataUsuario) {
        Date date = null;

        if (dataUsuario.length() < 10 || dataUsuario.length() > 10){
            System.out.println("Data Inválida.");
            System.exit(0);
        }

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            simpleDateFormat.setLenient(false);
            date = simpleDateFormat.parse(dataUsuario);
        } catch (ParseException e) {
            System.out.println("Data Inválida.");
            System.exit(0);
        }
        return true;
    }

    private static String mesExtenso(Integer m){
        String[] mes = {"Janeiro", "Fevereiro", "Março",
        "Abril", "Maio", "Junho", "Julho", "Agosto",
        "Setembro", "Outubro", "Novembro", "Dezembro"};

        return mes[m-1];
    }
}