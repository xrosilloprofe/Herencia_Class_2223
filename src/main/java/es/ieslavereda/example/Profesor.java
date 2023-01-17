package es.ieslavereda.example;

public class Profesor extends Persona{

    private Grado[] cursosImparte;

    public Profesor(String DNI, int edad, String nombre, String apellidos, Grado[] cursosImparte) {
        super(DNI, edad, nombre, apellidos);
        this.cursosImparte = cursosImparte;
    }

//    public Profesor(String DNI, int edad, String nombre, String apellidos, Grado ... cursosImparte) {
//        super(DNI, edad, nombre, apellidos);
//        this.cursosImparte = cursosImparte;
//    }

    public Grado[] getCursosImparte() {
        return cursosImparte;
    }

//    public void setCursosImparte(Grado[] cursosImparte) {
//        this.cursosImparte = cursosImparte;
//    }

    public void setCursosImparte(Grado ... cursosImparte) {
        this.cursosImparte = cursosImparte;
    }

    @Override
    public String toString(){
        String imparte="";
        for (Grado curso : cursosImparte)
            imparte += curso.toString() + " ";
        return super.toString() + "\n IMPARTE: " + imparte;
    }

}