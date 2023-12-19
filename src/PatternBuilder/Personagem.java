package PatternBuilder;

public class Personagem {
    private String nome;
    private String classe;
    private int nivel;
    private String arma;

    public Personagem(String nome, String classe, int nivel, String arma) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.arma = arma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Personagem {" +
                "nome: '" + nome + '\'' +
                ", classe: '" + classe + '\'' +
                ", nivel: " + nivel +
                ", arma: " + arma + '\''+"}";
    }

}
