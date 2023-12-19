package atividade4;

public class PersonagemBuilderImpl implements PersonagemBuilder{
    private String nome;
    private String classe;
    private int nivel;
    private String arma;

    @Override
    public void construirNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void construirClasse(String classe) {
        this.classe = classe;
    }

    @Override
    public void construirNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public void construirArma(String arma) {
        this.arma = arma;
    }

    @Override
    public Personagem build() {
        return new Personagem(nome, classe, nivel, arma);
    }
}
