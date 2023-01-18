package es.ieslavereda.abstractexample;

public class Main {
    public static void main(String[] args) {
        Bicicleta b1 = new Bicicleta("MountainBike");
        b1.subir1Velocidad();
        b1.subir1Velocidad();
        b1.subirVelocidad(3);
        b1.bajarVelocidad(1);
        b1.bajarVelocidad(100);
        System.out.println(b1);

        Coche c1 = new Coche("combustión","1111AAA");
        System.out.println(c1);
    }
}
