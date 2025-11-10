package com.atividade.itbi;

import javax.swing.JOptionPane;

public class CalculadoraITBI {
    public static void main(String[] args) {
        double valorTransacao = Double.parseDouble(JOptionPane.showInputDialog("Valor de transação:"));
        double valorVenal = Double.parseDouble(JOptionPane.showInputDialog("Valor venal:"));
        double percentual = Double.parseDouble(JOptionPane.showInputDialog("Percentual do ITBI:"));

        double base = Math.max(valorTransacao, valorVenal);
        double imposto = base * (percentual / 100);

        JOptionPane.showMessageDialog(null, "Imposto ITBI: " + imposto);
    }
}