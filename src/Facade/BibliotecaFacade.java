package Facade;

import java.util.ArrayList;

public class BibliotecaFacade {
    // Criação das Listas
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Emprestimo> emprestimos;

    public BibliotecaFacade() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
        emprestimos = new ArrayList<>();
    }

    // Método responsável por criar e adicionar um livro à lista livros
    public Livro adicionarLivro(String titulo, String autor, String isbn) {
        Livro livro = new Livro(titulo, autor, isbn);
        livros.add(livro);
        System.out.println("Livro Adicionado Com sucesso!!");
        return livro;
    }

    // Método responsável por criar e adicionar um Usuário à lista usuarios
    public Usuario cadastrarUsuario(String nome, int codigo) {
        Usuario usuario = new Usuario(nome, codigo);
        usuarios.add(usuario);
        System.out.println("Usuário Cadastrado Com sucesso!!");
        return usuario;
    }

    // Método responsável por criar e adicionar um Emprestimo à lista de emprestimos
    public Emprestimo realizarEmprestimo(Livro livro, Usuario usuario, String dataEmprestimo, String dataDevolucao) {
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataEmprestimo, dataDevolucao);
        emprestimos.add(emprestimo);
        System.out.println("Livro Emprestado Com sucesso!!");
        return emprestimo;
    }
}
