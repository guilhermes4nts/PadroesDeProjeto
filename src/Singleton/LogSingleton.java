package Singleton;
public class LogSingleton {
    private static LogSingleton log;
    public static LogSingleton getInstance() {
        if (log == null) {
            log = new LogSingleton();
        }
        return log;
    }

    public void mensagem(String mensagem){
        System.out.println(mensagem);
    }

}
