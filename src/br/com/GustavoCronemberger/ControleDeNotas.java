package br.com.GustavoCronemberger;

public class ControleDeNotas {

    public static void main (String[] args){

        int media1 = 7;
        int media2 = 6;
        int media3 = 8;
        int media4 = 7;
        int mediaT = (media1 + media2 + media3 + media4)/4;
        System.out.println("Média Final: " + mediaT);

    }

    public static String mediaFinal(int mediaT) {

        if (mediaT >= 7) {
            return "Você está aprovado!";
        } else if ((mediaT >= 5) && (mediaT <= 6)) {
            return "Você está de recuperação!";
        } else {
            return "Você está reprovado!";
        }
    }
}
