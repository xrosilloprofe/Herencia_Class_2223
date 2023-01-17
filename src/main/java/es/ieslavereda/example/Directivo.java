package es.ieslavereda.example;

public class Directivo extends Profesor{

    private String cargo;
    Directivo(String DNI, int edad, String nombre, String apellidos, Grado[] cursosImparte, String cargo) {
        super(DNI, edad, nombre, apellidos, cursosImparte);
        this.cargo = cargo;
    }
    public String getCargo() {
        return cargo;
    }
    @Override
    public String toString() {
        return super.toString() + "\n CARGO: " + cargo;
    }


}