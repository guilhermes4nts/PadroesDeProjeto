package Avaliacao01;

public class Gato extends Animal{
    public Gato(String numPatas, String tipoAlimento) {
        super(numPatas, tipoAlimento);
    }

//    @Override
    public Animal clone() {
        return new Gato(this.getNumPatas(), this.getTipoAlimento());
    }
}
