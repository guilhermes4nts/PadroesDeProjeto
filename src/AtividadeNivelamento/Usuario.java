package AtividadeNivelamento;

import java.util.ArrayList;

public class Usuario{
    public Usuario(int id, String nome){
        this.id = id;
        this.nome = nome;

    }
    public String nome;
    public int id;
    public ArrayList<Livro> livrosEmprestados = new ArrayList<>();

    public void estadoUsuario(){
        System.out.println("--------------------------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("Lista de Livros Emprestados: ");
        for ( Livro lista : livrosEmprestados){
            System.out.println("ID: "+lista.getId()+ " Nome: "+lista.getTitulo());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int numIdentificao) {
        this.id = numIdentificao;
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(Livro livro) {
        livrosEmprestados.add(livro);
    }
}
