package es.ieslavereda.multimedia;

public class Main {
    public static void main(String[] args) {
        Multimedia m1 = new Multimedia("1","A",Formato.AVI,120);
        Multimedia m2 = new Multimedia("1","A",Formato.DVD,90);
        System.out.println(m1.equals(m2));
        Pelicula p1 = new Pelicula("Avatar","Cameron",Formato.DVD,500,null,null);
        System.out.println(p1);
        Pelicula p2 = new Pelicula("Mujercitas","Greeta Gerwit", Formato.AVI,500,null,"Saoirse Ronan");
        System.out.println(p2);
        Pelicula p3 = new Pelicula("Avatar","Cameron",Formato.DVD,500,null,null);
        System.out.println(p1.equals(p3));
        Disco disco1 = new Disco("Random Access Memories", "Daft Punk",Formato.MP3,60,"Electrónica");
        System.out.println(disco1);

    }

}
