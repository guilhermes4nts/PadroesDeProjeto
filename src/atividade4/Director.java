package atividade4;

public class Director {
    public Personagem construirPersonagem(PersonagemBuilder builder) {
        builder.construirNome("Herói");
        builder.construirClasse("Arqueiro");
        builder.construirNivel(1);
        builder.construirArma("Arco");
        return builder.build();
    }
}
