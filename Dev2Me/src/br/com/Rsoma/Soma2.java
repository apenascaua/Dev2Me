package br.com.Rsoma;

import javax.swing.*;

public class Soma2 {
    public static void main(String [] args){
    int n1 = Integer.valueOf(JOptionPane.showInputDialog("salve"));

    int n2 = Integer.valueOf((JOptionPane.showInputDialog("eae")));

    int soma = 0;
    soma = n1 + n2;

     JOptionPane.showMessageDialog(null, "sua soma é " + soma);

    }
}