package es.ieslavereda.example;

public class Alumno extends Persona{

    private int NIA;
    private Grado grado;

    public Alumno(String DNI, int edad, String nombre, String apellidos, int NIA, Grado grado){
        super(DNI,edad,nombre,apellidos);
        this.NIA = NIA;
        this.grado = grado;
    }

    public Alumno(String DNI, int edad, String nombre, String apellidos, Grado grado){
        super(DNI,edad,nombre,apellidos);
        this.NIA = generateNIA();
        this.grado = grado;
    }

    private int generateNIA() { return (int)(Math.random()*100000000);}

    @Override
    public void printDNI(){
        System.out.println("example.Alumno - DNI: " + this.getDNI());
    }

    @Override
    public String toString() {
        return super.toString() + " NIA: " + NIA + " Grado " + this.grado;
    }

}
