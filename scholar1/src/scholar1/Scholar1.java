
package scholar1;


public class Scholar1 {

   
    public static void main(String[] args) {
       
        Empleado empleado1=new Empleado();
        empleado1.nombre= " laura daniela ";
        empleado1.apellido= " Rubiando Triana ";
        empleado1.fecha_nacimiento= " 31 agosto 2001";
        empleado1.calcEdad();
          System.out.println("el empleado se llama" + empleado1.nombre);
          System.out.println("el apellido del empleado es" + empleado1.apellido);
          System.out.println("la fecha de nacimiento del empleado es" + empleado1.fecha_nacimiento);
          System.out.println("la edad del empleado es" + empleado1.calcEdad());
          
        Estudiante estudiante1=new Estudiante();
        estudiante1.nombre= " lunellys paola ";
        estudiante1.apellido= " cortes montalvo ";
         System.out.println("el estudiante se llama" + estudiante1.nombre);
         System.out.println("el apellido del estudiante es" + estudiante1.apellido);
        
    }
    
}
