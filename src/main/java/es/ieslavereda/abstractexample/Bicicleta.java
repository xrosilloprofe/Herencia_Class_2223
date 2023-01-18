package es.ieslavereda.abstractexample;

public class Bicicleta extends Vehiculo{
    private String tipo;

    public Bicicleta(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean subirVelocidad(int velocidad) {
        //una bici no puede subir más de 4kms/h su velocidad de una
        if (velocidad<1 || velocidad >4)
            return false;
        this.setVelocidad(getVelocidad() + velocidad);
        return true;
    }

    @Override
    public boolean bajarVelocidad(int velocidad) {
        if ((velocidad > 4) || (velocidad < 0) || ((this.getVelocidad() - velocidad) < 0)) {
            return false;
        }
        this.setVelocidad(getVelocidad() - velocidad);
        return true;
    }

    @Override
    public String toString() {
        return "Bicicleta tipo=" + tipo + super.toString();
    }

}
