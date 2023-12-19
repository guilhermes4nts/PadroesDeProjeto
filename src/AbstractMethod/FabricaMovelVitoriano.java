package AbstractMethod;

public class FabricaMovelVitoriano implements FabricaMovel{
    @Override
    public Cadeira createCadeira() {
        return new CadeiraVitoriano();
    }

    @Override
    public Sofa createSofa() {
        return new SofaVitoriano();
    }

    @Override
    public MesaDeCentro createMesaDeCentro() {
        return new MesaVitoriano();
    }
}
