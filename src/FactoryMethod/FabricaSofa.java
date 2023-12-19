package FactoryMethod;

public class FabricaSofa implements FabricaMovel {
    @Override
    public Movel criarMovel() {
        return new Sofa();
    }
}
