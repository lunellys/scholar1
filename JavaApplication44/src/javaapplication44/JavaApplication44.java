/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication44;

import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class JavaApplication44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu = Integer.parseInt(JOptionPane.showInputDialog("menu principal\n" + "Elija un Numero\n" + "1.-union fisica\n" + "2.-union matematica\n" + "3.-porcentajes de pares e impares\n" + "4.-productoria primos\n" + "5.-sumatoria compuesto\n" + "salir"));
        switch (menu) {
            case 1:
                int h,
                 j;
                h = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño del primer vector"));
                j = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño del segundo vector"));
                 {
                    int pv[] = new int[h];
                    int sv[] = new int[j];
                    int uf[] = new int[h+j];
                    int n = 0;
                    for (int i = 1; n <= 3; i++) {

                        pv[i] = Integer.parseInt(JOptionPane.showInputDialog("llenar vector pv"));

                        sv[i] = Integer.parseInt(JOptionPane.showInputDialog("llenar vector sv"));

                    }
                }
        }
    }
}
