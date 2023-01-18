package es.ieslavereda.example;

public class Persona {
    protected final static int MAYOREDAD = 18;
    private String DNI;
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String DNI, int edad, String nombre, String apellidos) {
        this.DNI = DNI;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public final void cumplirAnos(){ this.edad++;}

    public void printDNI() {
        System.out.println("example.Persona - DNI: " + DNI );
    }

    @Override
    public String toString(){
        return "DNI=" + DNI + ", edad = " + edad +  ", nombre = " + nombre + ", apellidos = " + apellidos;
    }

}
