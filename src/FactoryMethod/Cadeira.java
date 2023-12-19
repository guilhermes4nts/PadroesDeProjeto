package FactoryMethod;

public class Cadeira implements Movel {
    @Override
    public void createMovel(int tipo) {
        if (tipo == 1){
            System.out.println( "Cadeira Moderna");
        } else if (tipo == 2) {
            System.out.println( "Cadeira Vitoriana");
        }else if(tipo == 3){
            System.out.println( "Cadeira ArtDeco");
        } else {
            System.out.println("Variação Inválida!");
        }
    }
}
