package es.ieslavereda.abstractexample;

public class Coche extends VehiculoMotor{

    private String matricula;

    public Coche(String tipoMotor, String matricula){
        super(tipoMotor);
        this.matricula = matricula;
    }

    @Override
    public boolean subirVelocidad(int velocidad) {
        if (velocidad<1 || velocidad >40)
            return false;
        this.setVelocidad(getVelocidad() + velocidad);
        return true;
    }

    @Override
    public boolean bajarVelocidad(int velocidad) {
        if ((velocidad > 40) || (velocidad < 0) || ((this.getVelocidad() - velocidad) < 0)) {
            return false;
        }
        this.setVelocidad(getVelocidad() - velocidad);
        return true;
    }
    @Override
    public void cambiarTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public String toString() {
        return "Coche matricula=" + matricula + " tipo de motor=" + getTipoMotor() + super.toString();
    }
}
