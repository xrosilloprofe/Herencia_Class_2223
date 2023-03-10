/**
 *     Empleado. Clase básica que describe a un empleado.
 *     Incluye sus datos personales (nombre, apellidos, DNI, dirección)
 *     y algunos datos tales como los años de antigüedad,
 *     teléfono de contacto y su salario.
 *     Incluye también información de quién es el empleado que lo supervisa.
 *     Tendrá, al menos, las siguientes funciones miembro:
 *     Constructores para definir correctamente un empleado, a partir de su nombre apellidos, DNI, dirección, teléfono y salario.
 *     Imprimir (Modificar método toString)
 *     Cambiar supervisor
 *     Incrementar salario
 */

package es.ieslavereda.harmazon;
import java.time.LocalDate;

public abstract class Empleado {
    private String nombre;
    private String apellidos;
    private String DNI;
    private String direccion;
    private LocalDate antiguedad;
    private String telefono;
    protected double salario; //accesible para su package && clases derivadas
    Empleado supervisor; //default (no se pone nada) y es accesible para su package

    public Empleado(String nombre, String apellidos, String DNI, String direccion, String telefono, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
        this.antiguedad = LocalDate.now();
    }

    public abstract boolean cambiarSupervisor(Empleado nuevoSupervisor);

    public abstract void incrementarSalario();

    @Override
    public String toString() {
        String datosSupervisor = (supervisor==null) ? "sin supervisor" : supervisor.nombre + " " + supervisor.apellidos;

        return "Nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", DNI='" + DNI + '\'' +
                ", dirección='" + direccion + '\'' +
                "\n, antiguedad=" + antiguedad +
                ", telefono='" + telefono + '\'' +
                ", salario=" + salario +
                ", supervisor=" + datosSupervisor +
                '}';
    }



}
