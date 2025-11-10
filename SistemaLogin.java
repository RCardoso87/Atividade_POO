package com.atividade.login;

import java.util.Scanner;

public class SistemaLogin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final String LOGIN = "java8";
        final String SENHA = "java8";

        int tentativas = 3;

        while (tentativas > 0) {
            System.out.print("Login: ");
            String login = sc.nextLine();

            System.out.print("Senha: ");
            String senha = sc.nextLine();

            if (login.equals(LOGIN) && senha.equals(SENHA)) {
                System.out.println("Acesso permitido.");
                break;
            }

            tentativas--;
            System.out.println("Credenciais incorretas. Tentativas restantes: " + tentativas);
        }

        if (tentativas == 0) {
            System.out.println("Acesso bloqueado.");
        }

        sc.close();
    }
}
