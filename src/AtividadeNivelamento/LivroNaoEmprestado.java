package AtividadeNivelamento;

public class LivroNaoEmprestado extends Exception {
    public LivroNaoEmprestado(){
        super("Este usuário não pegou este livro emprestado");
    }
}
