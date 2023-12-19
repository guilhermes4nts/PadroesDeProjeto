package PatternBuilder;

public interface PersonagemBuilder {
    void construirNome(String nome);
    void construirClasse(String classe);
    void construirNivel(int nivel);
    void construirArma(String arma);
    Personagem getPersonagem();
}
