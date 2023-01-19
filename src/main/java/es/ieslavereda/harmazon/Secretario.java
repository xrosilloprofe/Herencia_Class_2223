package es.ieslavereda.harmazon;

public class Secretario extends Empleado{
    private static final int INCREMENTO=5;
    private String despacho;
    private String fax;

    public Secretario(String nombre, String apellidos, String DNI, String direccion, String telefono, double salario, String despacho, String fax) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.despacho = despacho;
        this.fax = fax;
    }

    @Override
    public void incrementarSalario() {
        salario = (salario * (1+(INCREMENTO/100)));
    }

    @Override
    public boolean cambiarSupervisor(Empleado nuevoSupervisor) {
        if (!(nuevoSupervisor instanceof Secretario))
            return false;
        supervisor = nuevoSupervisor;
        return true;
    }

    @Override
    public String toString() {
        return "Secretario{" +
                "despacho='" + despacho + '\'' +
                ", fax='" + fax + '\'' +
                '}' + "\n" + super.toString();
    }
}
