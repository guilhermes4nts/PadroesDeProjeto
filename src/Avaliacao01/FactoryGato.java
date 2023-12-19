package Avaliacao01;

public class FactoryGato implements AnimalFactory{
    @Override
    public Animal criarAnimal(String numPata, String tipoAlimento) {
        return new Gato(numPata, tipoAlimento);
    }
}
