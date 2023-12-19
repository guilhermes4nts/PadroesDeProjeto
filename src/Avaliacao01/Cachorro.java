package Avaliacao01;

public class Cachorro extends Animal {
    public Cachorro(String numPatas, String tipoAlimento) {
        super(numPatas, tipoAlimento);
    }

    @Override
    public Animal clone(){
        return new Cachorro(this.getNumPatas(), this.getTipoAlimento());
    }
}
