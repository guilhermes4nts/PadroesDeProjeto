package Teste;

public class FabricadeCarro {
    private static FabricadeCarro instacia;
    private FabricadeCarro(){
    }

    public static FabricadeCarro getInstacia(){
        if (instacia == null)
            instacia = new FabricadeCarro();
        return instacia;
    }
}
