package AbstractMethod;

public class Logistica {
    public void fabricarMovel(int estilo, int tipo){
        FabricaMovel fabrica = null;
        Cadeira cadeira;
        MesaDeCentro mesa;
        Sofa sofa;
        // Verificando qual é a Fabrica do Movel
        if (tipo == 1){
            fabrica = new FabricaMovelModerno();
        } else if (tipo == 2) {
            fabrica = new FabricaMovelVitoriano();
        } else {
            fabrica = new FabricaMovelArtDeco();
        }

        // Verificando qual é o Movel e criando o mesmo

        switch (estilo){
            case 1:
                cadeira = fabrica.createCadeira();
                cadeira.criar();
                break;
            case 2:
                mesa = fabrica.createMesaDeCentro();
                mesa.criar();
                break;
            case 3:
                sofa = fabrica.createSofa();
                sofa.criar();
                break;
        }

    }
}
