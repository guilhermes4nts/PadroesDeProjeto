package Avaliacao01;

public abstract class Animal {

    private String numPatas;
    private String tipoAlimento;

    public Animal(String numPatas, String tipoAlimento) {
        this.numPatas = numPatas;
        this.tipoAlimento = tipoAlimento;
    }

    public abstract Animal clone();

    public String getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(String numPatas) {
        this.numPatas = numPatas;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }
}
