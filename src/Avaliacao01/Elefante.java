package Avaliacao01;

public class Elefante extends Animal{
    public Elefante(String numPatas, String tipoAlimento) {
        super(numPatas, tipoAlimento);
    }

    @Override
    public Animal clone() {
        return new Elefante(this.getNumPatas(), this.getTipoAlimento());
    }
}
