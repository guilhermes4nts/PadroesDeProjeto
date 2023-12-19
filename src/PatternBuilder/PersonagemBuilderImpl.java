package PatternBuilder;

public class PersonagemBuilderImpl implements PersonagemBuilder {
    private Personagem personagem;

    public PersonagemBuilderImpl() {
        this.personagem = new Personagem("", "", 0, "");
    }

    @Override
    public void construirNome(String nome) {
        personagem.setNome(nome);
    }

    @Override
    public void construirClasse(String classe) {
        personagem.setClasse(classe);
    }

    @Override
    public void construirNivel(int nivel) {
        personagem.setNivel(nivel);
    }

    @Override
    public void construirArma(String arma) {
        personagem.setArma(arma);
    }

    @Override
    public Personagem getPersonagem() {
        return personagem;
    }
}
