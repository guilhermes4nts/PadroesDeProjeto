package Facade;

public class Main {
    public static void main(String[] args) {
        BibliotecaFacade biblioteca = new BibliotecaFacade();

        // Adicionando e criando um livro
        Livro livro1 = biblioteca.adicionarLivro("Dom Casmurro", "Machado de Assis", "9780195106817");

        // Cadastrando e criando um usuário
        Usuario usuario1 = biblioteca.cadastrarUsuario("João", 1234);

        // Realizando um empréstimo
        String dataEmprestimo = "2023-12-19";
        String dataDevolucao = "2024-01-19";
        Emprestimo emprestimo = biblioteca.realizarEmprestimo(livro1, usuario1, dataEmprestimo, dataDevolucao);

    }
}
