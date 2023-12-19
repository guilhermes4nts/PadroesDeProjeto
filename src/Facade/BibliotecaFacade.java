package Facade;

import java.util.ArrayList;

public class BibliotecaFacade {
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Emprestimo> emprestimos;

    public BibliotecaFacade() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
        emprestimos = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, String isbn) {
        Livro livro = new Livro(titulo, autor, isbn);
        livros.add(livro);
        System.out.println("Livro adicionado com Sucesso");
    }

    public void cadastrarUsuario(String nome, int codigo) {
        Usuario usuario = new Usuario(nome, codigo);
        usuarios.add(usuario);
        System.out.println("Cadastro realizado com Sucesso!");
    }

    public void realizarEmprestimo(Livro livro, Usuario usuario, String dataEmprestimo, String dataDevolucao) {
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataEmprestimo, dataDevolucao);
        emprestimos.add(emprestimo);
        System.out.println("Emprestimo realizado com Sucesso!");

    }
}
