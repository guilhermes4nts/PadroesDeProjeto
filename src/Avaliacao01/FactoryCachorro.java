package Avaliacao01;

public class FactoryCachorro implements AnimalFactory{
    @Override
    public Animal criarAnimal(String numPatas, String tipoAlimento) {
        return new Cachorro(numPatas,tipoAlimento);
    }
}
