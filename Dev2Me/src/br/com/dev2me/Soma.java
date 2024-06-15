package br.com.dev2me;

import javax.swing.*;

public class Soma {
    public static void  main(String[] args){
        int n1 = Integer.valueOf(JOptionPane.showInputDialog("Digite seu numero"));
        int n2 = Integer.valueOf(JOptionPane.showInputDialog("Digite seu numero"));

        int soma = 0;
        soma = n1 + n2;

        System.out.println(soma);
    }
}
