package es.ieslavereda.example;

public enum Grado {

    ASIR_PRIMERO(1,"ASIR"),
    ASIR_SEGUNDO(2,"ASIR"),
    DAM_PRIMERO(1,"DAM"),
    DAM_SEGUNDO(2,"DAM"),
    SMR_PRIMERO(1,"SMR"),
    SMR_SEGUNDO(2,"SMR"),
    DAW_PRIMERO(1,"DAW"),
    DAW_SEGUNDO(2,"DAW");

    private final int curso;
    private final String tipoGrado;

    Grado(int curso, String tipoGrado) {
        this.curso = curso;
        this.tipoGrado = tipoGrado;
    }
    public String getTipoGrado() {
        return tipoGrado;
    }
    public int getCurso() {
        return curso;
    }
    @Override
    public String toString() {
        return "( " + curso + " de " + tipoGrado + " ) ";
    }
}
