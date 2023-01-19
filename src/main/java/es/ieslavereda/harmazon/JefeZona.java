package es.ieslavereda.harmazon;

import java.util.Arrays;

public class JefeZona extends Empleado {

    private static final int INCREMENTO=20;
    private String despacho;
    private Secretario secretario;
    private Vendedor[] vendedores;
    private Coche coche;

    @Override
    public void incrementarSalario() {
        salario = (salario * (1+(INCREMENTO/100)));
    }

    @Override
    public boolean cambiarSupervisor(Empleado nuevoSupervisor) {
        if (!(nuevoSupervisor instanceof JefeZona))
            return false;
        supervisor = nuevoSupervisor;
        return true;
    }

    public JefeZona(String nombre, String apellidos, String DNI, String direccion, String telefono, double salario, String despacho, Secretario secretario, Vendedor[] vendedores, Coche coche) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.despacho = despacho;
        this.secretario = secretario;
        this.vendedores = vendedores;
        this.coche = coche;
    }

    @Override
    public String toString() {
        return "JefeZona{" +
                "despacho='" + despacho + '\'' +
                ", secretario=" + secretario +
                ", vendedores=" + Arrays.toString(vendedores) +
                ", coche=" + coche +
                '}' + "\n" + super.toString();
    }

    public void cambiarSecretario(Secretario newSecre) {
        this.secretario = newSecre;
    }
    public void cambiarCoche(Coche car){
        this.coche = car;
    }

    public void anyadirVendedor(Vendedor vendedor){
        Vendedor[] aux = new Vendedor[vendedores.length+1];
        System.arraycopy(vendedores,0,aux,0,vendedores.length);
        aux[aux.length-1] = vendedor;
        vendedores = aux;
    }

    public boolean borrarVendedor(Vendedor vendedor) {
        int pos = buscarVendedor(vendedor);
        if (pos < 0)
            return false;
        Vendedor[] aux = new Vendedor[vendedores.length-1];
        System.arraycopy(vendedores,0,aux,0,pos-1);
        System.arraycopy(vendedores,pos+1,aux,pos+1,(vendedores.length-pos));
        vendedores = aux;
        return true;
    }

    private int buscarVendedor(Vendedor vendedor){
        for (int i = vendedores.length; i >=0 ; i--) {
            if(vendedores[i].equals(vendedor))
                return i;
        }
        return -1;
    }


}
