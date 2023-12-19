package AtividadeNivelamento;

import java.util.ArrayList;

public class Biblioteca{
    public ArrayList<Livro> livrosJaEmprestados = new ArrayList<>();
    public ArrayList<Livro> livrosDisponiveis = new ArrayList<>();
    public ArrayList<Usuario> usuariosCadastrados = new ArrayList<>();

    // CONSTRUTOR E METODOS

    public Biblioteca() {
        livrosDisponiveis.add(new Livro(1, "Jogador n1", "Ernest Cline", 2011));
        livrosDisponiveis.add(new Livro(2, "Pequeno Principe", "Antoine de Saint-Exupéry", 1943));
        livrosDisponiveis.add(new Livro(3, "Coraline", "Neil Gaiman", 2002));
        livrosDisponiveis.add(new Livro(4, "Java Programming", "John Smith", 2020));
        livrosDisponiveis.add(new Livro(5, "Python for Beginners", "Jane Doe", 2019));
        livrosDisponiveis.add(new Livro(6, "JavaScript Essentials", "Alice Johnson", 2021));
        livrosDisponiveis.add(new Livro(7, "Data Structures in Java", "Bob Brown", 2018));
        usuariosCadastrados.add(new Usuario(1, "Guilherme"));
        usuariosCadastrados.add(new Usuario(2, "Alexandre"));
        usuariosCadastrados.add(new Usuario(3, "Junior"));
        usuariosCadastrados.add(new Usuario(4, "Nevada"));
        usuariosCadastrados.add(new Usuario(6, "Bill"));
    }


    public void emprestarLivro(Usuario usuario, Livro livro) throws LivroJaEmprestado {
        //verificando se o livro já foi emprestado
        boolean teste = true;

        for (Livro aux : livrosJaEmprestados){
            if (aux.getTitulo().equals(livro.getTitulo())){
                teste = false;
            }
        }

        // Caso o livro esteja disponivel
        if (teste){
            usuario.setLivrosEmprestados(livro);
            livrosDisponiveis.remove(livro);
            livro.setStatus("emprestado");
            livrosJaEmprestados.add(livro);
        }
        //Exceção caso o livro ja tenha sido emprestado
        if (!teste){
            throw new LivroJaEmprestado();
        }
    }

    public void devolverLivro(Usuario usuario, Livro livro) throws LivroNaoEmprestado{
        //Verificado de o livro pode ser Devolvido
        boolean teste = false;
        for (Livro aux : usuario.livrosEmprestados){
            if (livro.getId() == aux.getId()){
                teste = true;
            }
        }

        //Caso o livro possa ser Devolvido
        if (teste){
            livro.setStatus("disponivel");
            livrosDisponiveis.add(livro);
            livrosJaEmprestados.remove(livro);
            usuario.livrosEmprestados.remove(livro);
        }

        //Exceção caso o livro não pertença ao usuário ou o livro ja foi devolvido
        if (!teste){
            throw new LivroNaoEmprestado();
        }
    }

    public void buscarLivroPorTitulo(String titulo){
        int cont = 0;
        System.out.println("Resultado da busca: ");
        //Verificando na lista de Livros disponíveis
        for (Livro aux : livrosDisponiveis){
            if (aux.getTitulo().toLowerCase().contains(titulo)){
                System.out.println("ID: "+ aux.getId() + " Nome: "+aux.getTitulo() +" Autor: "+
                            aux.getAutor() +" Ano de Publicação: "+ aux.getAnoPublicacao()+" Status: "+ aux.getStatus());
                cont++;
            }
        }
        //Verificando na lista de Livros que foram emprestados
        for (Livro a : livrosJaEmprestados){
            if (a.getTitulo().toLowerCase().contains(titulo)){
                System.out.println("ID: "+ a.getId() + " Nome: "+a.getTitulo() +" Autor: "+
                        a.getAutor() +" Ano de Publicação: "+ a.getAnoPublicacao()+" Status: "+ a.getStatus());
                cont++;
            }
        }

        if (cont == 0){
            System.out.println("Nenhum Livro Encrontrado");
        }

    }

    public void mostrarLivrosDisponíveis(){
        System.out.println("Lista de Livros Disponíveis: ");
        for (Livro l : livrosDisponiveis){
            System.out.println("ID: "+ l.getId() +" Título: "+ l.getTitulo() +
                    " Ano de Publicação: " + l.getAnoPublicacao() +" Status: "+ l.getStatus());
        }
    }

    public void mostrarUsuarios(){
        System.out.println("Lista de Usuários Disponíveis: ");
        for (Usuario u : usuariosCadastrados){
            System.out.println("ID: "+ u.getId() +" Nome: "+ u.getNome());
        }
    }

    public Usuario buscarUsuario(int id){
        Usuario aux = null;
        for (Usuario usuario : usuariosCadastrados){
            if (usuario.id == id){
                return usuario;
            }
        }
        return aux;
    }

    public Livro buscarLivro(int id){
        Livro aux = null;
        for (Livro livro : livrosDisponiveis){
            if (livro.getId() == id){
                return livro;
            }
        }
        for (Livro l: livrosJaEmprestados){
            if (l.getId() == id){
                return l;
            }
        }
        return aux;
    }

}
