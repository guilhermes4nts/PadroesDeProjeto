package Avaliacao01;

public class FactoryElefante implements AnimalFactory{
    @Override
    public Animal criarAnimal(String numPata, String tipoAlimento) {
        return new Elefante(numPata, tipoAlimento);
    }
}
