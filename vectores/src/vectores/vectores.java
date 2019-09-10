/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores ;

import javax.swing.*;

/**
 *
 *
 */
public class vectores {

    public static void main(String[] args) {
        double  prom = 0, nota, notamayor = 0, notamenor = 0, aprob = 0, reprob = 0, h;
        int can = 0;
        can=Integer.parseInt(JOptionPane.showInputDialog(null,"Digiten la cantidad de notas a ingresar"));
        double notas[] = new double[can];
        String nombre[] = new String[can];
        String namebaja="", namealta="";
       
        for (int i = 0; i < can; i++) {
            nombre[i] = JOptionPane.showInputDialog("Digite Nombre del Estudiante");
            do {
          
      notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite su nota definitiva "));

            } while (notas[i] < 2 || notas[i] > 5);

            prom = prom + notas[i];
            if (notas[i] >= 3) {
                aprob = aprob + 1;
            }
            h = notas[0];
            if (notas[i] < h) {
                notamenor = notas[i];
                namebaja = nombre[i];
            } else if (notas[i] >= h) {
                notamayor = notas[i];
                namealta= nombre[i];
            }
        }

        reprob = (can - aprob) / can * 100;
        aprob = aprob / can * 100;

        JOptionPane.showMessageDialog(
                null, "El promedio de Notas es : " + (prom / can)
                + "\n el promedio de aprobados es : " + aprob
                + "\n el promedio de no aprobados es : " + reprob
                + "\n La Nota mas alta fue  de:" + namealta + " y fue: " + notamayor
                + "\n La Nota mas baja fue  de:" + namebaja + " y fue: "+ notamenor);

    }
   
}