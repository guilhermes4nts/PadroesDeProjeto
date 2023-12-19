package FactoryMethod;

public class MesaDeCentro implements Movel {
    @Override
    public void createMovel(int tipo) {
        if (tipo == 1){
            System.out.println("Mesa de Centro Moderna");
        } else if (tipo == 2) {
            System.out.println("Mesa de Centro Vitoriano");
        }else if(tipo == 3){
            System.out.println("Mesa de Centro ArtDeco");
        }else{
            System.out.println("Variação Inválida!");
        }
    }
}
