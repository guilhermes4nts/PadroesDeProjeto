package FactoryMethod;

public class FabricaCadeira implements FabricaMovel{
    @Override
    public Movel criarMovel() {
        return new Cadeira();
    }
}
