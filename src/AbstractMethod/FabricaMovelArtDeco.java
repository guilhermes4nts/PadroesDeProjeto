package AbstractMethod;

public class FabricaMovelArtDeco implements FabricaMovel{

    @Override
    public Cadeira createCadeira() {
        return new CadeiraArtDeco();
    }

    @Override
    public Sofa createSofa() {
        return new SofaArtDeco();
    }

    @Override
    public MesaDeCentro createMesaDeCentro() {
        return new MesaArtDeco();
    }
}
