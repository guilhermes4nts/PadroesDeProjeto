package AbstractMethod;

public class FabricaMovelModerno implements FabricaMovel{
    @Override
    public Cadeira createCadeira() {
        return new CadeiraModerna();
    }

    @Override
    public Sofa createSofa() {
        return new SofaModerno();
    }

    @Override
    public MesaDeCentro createMesaDeCentro() {
        return new MesaModerna();
    }
}
