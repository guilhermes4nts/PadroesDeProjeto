package FactoryMethod;

public class Logistica {
    public void fabricarMovel(int estilo, int tipo){
        FabricaMovel fabrica = null;

        if (estilo == 1){
            fabrica = new FabricaCadeira();
        } else if (estilo == 2) {
            fabrica = new FabricaMesa();
        } else if (estilo == 3) {
            fabrica = new FabricaSofa();
        } else {
            System.out.println("Opcao invalida");
        }

        Movel movel = fabrica.criarMovel();
        movel.createMovel(tipo);
    }
}
