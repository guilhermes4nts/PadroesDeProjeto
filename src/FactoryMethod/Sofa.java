package FactoryMethod;

public class Sofa implements Movel {
    @Override
    public void createMovel(int tipo) {
        if (tipo == 1){
            System.out.println( "Sofá Moderno");
        } else if (tipo == 2) {
            System.out.println( "Sofá Vitoriano");
        }else if (tipo == 3){
            System.out.println( "Sofá ArtDeco");
        }else {
            System.out.println("Variação Inválida!");
        }
    }
}
