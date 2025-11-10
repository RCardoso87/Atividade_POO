package com.atividade.resistencia;

import java.util.Scanner;

public class CircuitoResistencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] resistencias = new double[4];

        for (int i = 0; i < resistencias.length; i++) {
            System.out.print("Digite a resistência " + (i + 1) + ": ");
            resistencias[i] = sc.nextDouble();
        }

        double soma = 0, maior = resistencias[0], menor = resistencias[0];

        for (double r : resistencias) {
            soma += r;
            if (r > maior) maior = r;
            if (r < menor) menor = r;
        }

        System.out.println("Resistência equivalente: " + soma);
        System.out.println("Maior resistência: " + maior);
        System.out.println("Menor resistência: " + menor);

        sc.close();
    }
}
