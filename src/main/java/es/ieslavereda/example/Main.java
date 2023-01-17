package es.ieslavereda.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Persona[] personas = new Persona[5];
        Scanner sc = new Scanner(System.in);

        personas[0] = new Persona("1234X", 29, "salman", "badwa");
        personas[1] = new Persona("2345Y", 18, "ian", "maio");
        personas[2] = new Persona("3Z", 21, "carlos", "cremades");
        personas[3] = new Persona("4X", 18, "aitor", "lopez");
        personas[4] = new Persona("5P", 18, "ruben", "flores");

        for (Persona p : personas) {
            p.cumplirAnos();
            System.out.println(p);
        }

        Alumno lia = new Alumno("6A",18,"lia","acosta",Grado.DAM_PRIMERO);
        Alumno santi = new Alumno("7Q",19,"santi","soler",73,Grado.DAM_SEGUNDO);

        System.out.println(lia);
        System.out.println(santi);

        personas[3].printDNI();
        santi.printDNI();

        Grado[] gradosPepa = {Grado.DAM_SEGUNDO, Grado.SMR_PRIMERO};
        Profesor pepa = new Profesor("74411111X",50,"Pepa","Navarro",gradosPepa);
        Profesor luna = new Profesor("98765421V",35,"Luna","Cano",new Grado[]{Grado.DAM_PRIMERO, Grado.ASIR_PRIMERO});
        System.out.println(pepa);
        System.out.println(luna);

        Directivo blanca = new Directivo("2W",55,"Blanca","Romero",new Grado[]{Grado.DAM_PRIMERO},"Cap d'FCTs");
        blanca.cumplirAnos();
        System.out.println(blanca);

        //Impliciting casting - obj es Object pero también Directivo
        Object obj = new Directivo("8K",35,"Dulce","Pasión",new Grado[]{Grado.DAM_PRIMERO},"Directora");
        System.out.println(obj);
//        obj.cumplirAnos(); <-- no es Persona

        //Explicit casting - obj es que es de tipo Object
        if (obj instanceof Directivo) {
            Directivo prof1 = (Directivo) obj;
            System.out.println(prof1);
            prof1.cumplirAnos();
        }


    }
}
