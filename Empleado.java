import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Empleado {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private float sueldo;
    private int edad;

    public Empleado(String nombrex, String apellidox, LocalDate fechaNacimientox, float sueldo){
        nombre= nombrex;
        apellido= apellidox;
        fechaNacimiento= fechaNacimientox;
        this.sueldo= sueldo;
    }
    public Empleado(String nombre, String apellido, float sueldo){/*No se si esta de mas, lo estaba por usar
         pero lo deje por si acaso. Seguire Practicando con este Ejercicio*/
        this.nombre=nombre;
        this.apellido= apellido;
        this.sueldo= sueldo;

    }
    public int calculaEdad(){
        LocalDate fechaActual = LocalDate.now();
        edad = fechaActual.getYear()-fechaNacimiento.getYear();
        return edad;

    }
    public String dameDatos(){
        return "Nombre: "+nombre+" Apellido: "+apellido+" Fecha Nacimiento: "+fechaNacimiento+" sueldo:"+sueldo;
    }
    public float getSueldo() {
        return sueldo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

}
