package Facade;

public class Usuario {
    // Atributos basicos de Usuário
    private String nome;
    private int id;

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    // Métodos Getter e Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
