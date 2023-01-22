package es.ieslavereda.harmazon;

public class Main {
    public static void main(String[] args) {

        //Creamos 3 secretarios
        Secretario s1 = new Secretario("lisandro", "martínez", "11Q", "casa de lisandro", "123", 25000.00,"despacho 1", "124");
        Secretario s2 = new Secretario("martin", "odegaard", "12W", "casa de martin", "125", 27500.00,"despacho 2", "126");
        Secretario s3 = new Secretario("david", "de gea", "13E", "casa de david", "127", 29000.00,"despacho 3", "128");

        //aumentamos salario a s1
        s1.incrementarSalario();

        //hacemos cambios de supervisores
        s1.cambiarSupervisor(s2);
        s1.cambiarSupervisor(s3);
        s2.cambiarSupervisor(s3);

        //imprimimos secretarios
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //creamos 5 clientes y 5 coches
        Cliente c1 = new Cliente("rubén", "garcía", "20Q","su casa c1","44");
        Cliente c2 = new Cliente("pere", "milla", "21Q","su casa c2","45");
        Cliente c3 = new Cliente("kike", "garcía", "22Q","su casa c3","46");
        Cliente c4 = new Cliente("pedro", "bigas", "23Q","su casa c4","47");
        Cliente c5 = new Cliente("kike", "barja", "24Q","su casa c5","48");

        Coche coche1 = new Coche("xx1","ford","fiesta");
        Coche coche2 = new Coche("xx2","ford","focus");
        Coche coche3 = new Coche("xx3","ford","puma");
        Coche coche4 = new Coche("xx4","ford","cmax");
        Coche coche5 = new Coche("xx5","ford","K");

        //creamos 3 vendedores
        Vendedor v1 = new Vendedor("eddie","nketiah","33A","su casa v1","552",25000.00,coche1,"555","Valencia",new Cliente[]{c1, c2, c3},10);
        Vendedor v2 = new Vendedor("marcus","rashford","34B","su casa v2","562",27500.00,coche2,"556","Castellón",null,15);
        Vendedor v3 = new Vendedor("mikel","arteta","35C","su casa v3","572",29500.00,coche3,"557","Alicante", new Cliente[]{c4,c1,c5},20);

        //probamos los métodos de los vendedores
        v1.incrementarSalario();
        v1.cambiarSupervisor(v3);
        v2.cambiarSupervisor(v3);
        v3.cambiarSupervisor(s1);

        v1.borrarCliente(c1);
        v2.anyadirCliente(c1);
        v1.borrarCliente(c2);
        v2.anyadirCliente(c2);
        v1.borrarCliente(c3);
        v2.anyadirCliente(c3);
        v1.borrarCliente(c4);
        v2.borrarCliente(c4);
        v3.borrarCliente(c1);
        v3.cambiarCoche(coche5);

        //imprimimos a los vendedores
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        //creamos 2 jefes de zona y probamos sus métodos
        JefeZona jz1 = new JefeZona("bukayo","saka","99K","su casa jz1","789",30000,"despacho 1",s2,new Vendedor[]{v1,v2,v3},coche4);
        JefeZona jz2 = new JefeZona("luke","shaw","98L","su casa jz2","788",35000,"despacho 2",s1,null,coche3);
        jz1.incrementarSalario();
        jz1.cambiarCoche(coche5);
        jz2.cambiarSecretario(s3);
        jz1.cambiarSupervisor(v1);
        jz1.cambiarSupervisor(jz2);
        jz1.borrarVendedor(v2);
        jz1.borrarVendedor(v2);
        jz2.anyadirVendedor(v2);

        //imprimimos a los jefes de zona
        System.out.println(jz1);
        System.out.println(jz2);



    }
}
