import java.io.*;
import java.lang.System.Logger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.Format;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class EjercicioNro5 {

    public static void main(String[] args) {
        Path path = Paths.get("D:/infoetapa3/java03/Ejercicio5/Empleados.txt");
      
        try {
            String empleados = Files.readString(path);
            String[] campo= empleados.split(",");
            
            //Dar formato Fecha
            DateTimeFormatter formato= DateTimeFormatter.ofPattern("d-MM-yyyy"); 
            LocalDate nacimiento = LocalDate.parse(campo[2], formato);
            LocalDate nacimiento2 = LocalDate.parse(campo[6], formato);
            LocalDate nacimiento3 = LocalDate.parse(campo[10], formato);
            LocalDate nacimiento4 = LocalDate.parse(campo[14], formato);
            LocalDate nacimiento5 = LocalDate.parse(campo[18], formato);
            //Dar formato $sueldo
            float sueldo = Float.valueOf(campo[3]);
            float sueldo2 = Float.valueOf(campo[7]);
            float sueldo3 = Float.valueOf(campo[11]);
            float sueldo4 = Float.valueOf(campo[15]);
            float sueldo5 = Float.valueOf(campo[19]);

            //Ingreso de registros
            List<Empleado> empleado = new ArrayList<>();
        
            empleado.add(new Empleado(campo[0], campo[1],nacimiento, sueldo));
            empleado.add(new Empleado(campo[4], campo[5],nacimiento2, sueldo2));
            empleado.add(new Empleado(campo[8], campo[9],nacimiento3, sueldo3));
            empleado.add(new Empleado(campo[12], campo[13],nacimiento4, sueldo4));
            empleado.add(new Empleado(campo[16], campo[17],nacimiento5, sueldo5));
            
            System.out.println("Listas de empleados:");
            for (Empleado e : empleado) {
                
                System.out.println("Nombre: "+e.getNombre()+" - Apellido: "+e.getApellido()+" - FechaNacimiento: "+
                                    e.getFechaNacimiento()+" - Sueldo:$"+e.getSueldo()+"- Edad:"+e.calculaEdad());
            }
            /*Lo hice de esta forma por que no encontraba la forma de sacar
             el menor y mayor sueldo usando la clase*/
            List sueldox = new ArrayList<>();
                sueldox.add(sueldo);
                sueldox.add(sueldo2);
                sueldox.add(sueldo3);
                sueldox.add(sueldo4);
                sueldox.add(sueldo5);
            System.out.println("El sueldo Mayor es de: $"+Collections.max(sueldox));
            System.out.println("El sueldo Menor es de: $"+Collections.min(sueldox));

           }catch (IOException e){
             e.printStackTrace(); 
    }//catch (IOException e){
      //  e.printStackTrace();   
  }
}