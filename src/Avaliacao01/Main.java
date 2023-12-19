package Avaliacao01;

public class Main {
    public static void main(String[] args) {

        // Criando os animais
        AnimalFactory cachorroFactory = new FactoryCachorro();
        AnimalFactory elefanteFactory = new FactoryElefante();
        AnimalFactory gatoFactory = new FactoryGato();
        Animal cachorro = cachorroFactory.criarAnimal("4", "Ração");
        Animal elefante = elefanteFactory.criarAnimal("10", "Capim");
        Animal gato = gatoFactory.criarAnimal("6", "Carne");

        // Criando os clones desses animais
        Animal cachorroClone = cachorro.clone();
        Animal elefanteClone = elefante.clone();
        Animal gatoClone = gato.clone();

        // Exibindo as informações do animal original e seu clone
        System.out.println("Cachorro: "+ cachorro.getNumPatas() + " , " + cachorro.getTipoAlimento());
        System.out.println("Cachorro Clone: "+ cachorroClone.getNumPatas() + " , " + cachorroClone.getTipoAlimento());
        System.out.println("Elefante: "+ elefante.getNumPatas() + " , " + elefante.getTipoAlimento());
        System.out.println("Elefante Clone: "+ elefanteClone.getNumPatas() + " , " + elefanteClone.getTipoAlimento());
        System.out.println("Gato: "+ gato.getNumPatas() + " , " + gato.getTipoAlimento());
        System.out.println("Gato Clone: "+ gatoClone.getNumPatas() + " , " + gatoClone.getTipoAlimento());
    }
}
