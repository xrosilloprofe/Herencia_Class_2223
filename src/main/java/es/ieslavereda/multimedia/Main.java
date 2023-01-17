package es.ieslavereda.multimedia;

public class Main {
    public static void main(String[] args) {
        Multimedia m1 = new Multimedia("1","A",Formato.AVI,120);
        Multimedia m2 = new Multimedia("1","A",Formato.DVD,90);
        System.out.println(m1.equals(m2));
    }

}
