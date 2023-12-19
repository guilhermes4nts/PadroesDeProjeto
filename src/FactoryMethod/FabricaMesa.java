package FactoryMethod;

public class FabricaMesa implements FabricaMovel{
    @Override
    public Movel criarMovel() {
        return new MesaDeCentro();
    }
}
