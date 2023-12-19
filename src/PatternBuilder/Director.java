package PatternBuilder;

public class Director {
    public void construirPersonagem(PersonagemBuilder builder) {
        builder.construirNome("Sung Jin-woo");
        builder.construirClasse("Monarca das Sombras");
        builder.construirNivel(210);
        builder.construirArma("Criação de Sombras");
    }
}
