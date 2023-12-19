package AtividadeNivelamento;

public class LivroJaEmprestado extends Exception{
    public LivroJaEmprestado() {
        super("Este Livro não está disponível para Emprestimo!");
    }
}
