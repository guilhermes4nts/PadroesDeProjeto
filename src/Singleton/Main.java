package Singleton;

public class Main {
    public static void main(String[] args) {
        LogSingleton logger1 = LogSingleton.getInstance();
        LogSingleton logger2 = LogSingleton.getInstance();

        logger1.mensagem("Teste 1");
        logger2.mensagem("Teste 2");


        if (logger1 == logger2){
            System.out.println("Logger1 e Logger2 são mesma instância!");
        }else{
            System.out.println("Logger1 e Logger2 são de instâncias diferentes!");
        }

    }

}
