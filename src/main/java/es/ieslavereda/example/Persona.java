package es.ieslavereda.example;

public class Persona {
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

    public void cumplirAnos(){ this.edad++;}

}
