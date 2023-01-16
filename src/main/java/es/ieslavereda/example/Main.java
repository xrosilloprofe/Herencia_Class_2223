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

        personas[3].printDNI();

        Alumno lia = new Alumno("6A",18,"lia","acosta",Grado.DAM_PRIMERO);
        Alumno santi = new Alumno("7Q",19,"santi","soler",73,Grado.DAM_SEGUNDO);

        System.out.println(lia);
        System.out.println(santi);

//        Alumno ruben = (Alumno) personas[4];
//        System.out.println(ruben);
//        Persona lia = new Persona("6A",18,"lia","acosta");


    }
}
