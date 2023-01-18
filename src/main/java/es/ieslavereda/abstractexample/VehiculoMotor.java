package es.ieslavereda.abstractexample;

public abstract class VehiculoMotor extends Vehiculo{
    protected String tipoMotor;

    public VehiculoMotor(String tipoMotor){
        this.tipoMotor = tipoMotor;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public abstract void cambiarTipoMotor(String tipoMotor);


}
