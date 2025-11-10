package com.atividade.aposentadoria;

import java.util.Scanner;

public class CalculadoraAposentadoria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("Sexo (M/F): ");
        String sexo = sc.next().toUpperCase();

        System.out.print("Anos de contribuição: ");
        int contribuicao = sc.nextInt();

        boolean mulher = sexo.equals("F");
        int idadeMin = mulher ? 62 : 65;
        int contMin = mulher ? 30 : 35;

        boolean aposentaIdade = idade >= idadeMin;
        boolean aposentaCont = contribuicao >= contMin;

        if (aposentaIdade || aposentaCont) {
            System.out.println("Pode se aposentar.");
        } else {
            System.out.println("Ainda não pode se aposentar.");
            System.out.println("Faltam " + (idadeMin - idade) + " anos para aposentadoria por idade.");
            System.out.println("Faltam " + (contMin - contribuicao) + " anos para aposentadoria por contribuição.");
        }

        sc.close();
    }
}
