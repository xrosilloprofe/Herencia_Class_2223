package es.ieslavereda.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Persona[] personas = new Persona[5];
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < personas.length; i++) {
            int edad= sc.nextInt();

            personas[i] = new Persona("1234X", edad, "salman"+i, "badwa");
        }

        for (Persona p : personas) {
            p.cumplirAnos();
            System.out.println(p.getNombre() + p.getEdad());
        }
    }
}
