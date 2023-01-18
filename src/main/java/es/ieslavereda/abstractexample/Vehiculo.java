package es.ieslavereda.abstractexample;

public abstract class Vehiculo {

    private int velocidad;

    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public abstract boolean subirVelocidad(int velocidad);
    public abstract boolean bajarVelocidad(int velocidad);

    public void subir1Velocidad() { velocidad++;}
    public void bajar1Velocidad() { velocidad--;}
    @Override
    public String toString() {
        return " Velocidad= " + velocidad;
    }

}
