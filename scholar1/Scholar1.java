
package scholar1;

import java.util.Scanner;


public class Scholar1 {

   
    public static void main(String[] args) {
       
        Empleado empleado1=new Empleado();
        empleado1.nombre= " lunellys paola ";
        empleado1.apellido= " Cortes Montalvo ";
        empleado1.fecha_nacimiento= " 02 mayo 2001";
        
          System.out.println("el empleado se llama" + empleado1.nombre);
          System.out.println("el apellido del empleado es" + empleado1.apellido);
          System.out.println("la fecha de nacimiento del empleado es" + empleado1.fecha_nacimiento);
        
          Scanner lectura=new Scanner (System.in);
         int edad, año_nacimiento, año_actual;
         System.out.println("Ingrese el año de nacimiento");
         año_nacimiento=lectura.nextInt();
         System.out.println("ingrese el año actual");
         año_actual=lectura.nextInt();
         edad=año_actual-año_nacimiento;
         System.out.println("la edad del empleado es" + edad);
          
        Estudiante estudiante1=new Estudiante();
        estudiante1.nombre= " laura daniela";
        estudiante1.apellido= " Rubiando Triana ";
         System.out.println("el estudiante se llama" + estudiante1.nombre);
         System.out.println("el apellido del estudiante es" + estudiante1.apellido);
         
         System.out.println("Ingrese el año de nacimiento");
         año_nacimiento=lectura.nextInt();
         System.out.println("ingrese el año actual");
         año_actual=lectura.nextInt();
         edad=año_actual-año_nacimiento;
         System.out.println("la edad del empleado es" + edad);
        
    }
    
}
