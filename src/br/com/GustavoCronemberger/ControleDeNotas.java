package br.com.GustavoCronemberger;

import java.util.Scanner;

import static br.com.GustavoCronemberger.ControleDeNotas.getNota;

public class ControleDeNotas {

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        int nota1 = s.nextInt();
        System.out.println("Digite a segunda nota: ");
        int nota2 = s.nextInt();
        System.out.println("Digite a terceira nota: ");
        int nota3 = s.nextInt();
        System.out.println("Digite a quarta nota: ");
        int nota4 = s.nextInt();
        int nota = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("Sua média é: " + nota);

        String notaSt = getNota(nota);
        System.out.println(notaSt);

    }
    public static String getNota (int nota){
        if (nota >= 7) {
            return "Você está aprovado!";
        } else if ((nota >= 4) || (nota <= 6)) {
            return "Você está de recuperação!";
        } else {
            return "Você está reprovado!";
        }
    }
}
