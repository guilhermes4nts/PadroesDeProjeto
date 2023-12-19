package atividade4;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        PersonagemBuilder builder = new PersonagemBuilderImpl();

        Personagem personagem1 = director.construirPersonagem(builder);
        System.out.println(personagem1);

        // Construindo outro personagem
        builder.construirNome("Bruxo");
        builder.construirClasse("Bruxo");
        builder.construirNivel(1);
        builder.construirArma("varinha");
        Personagem personagem2 = builder.build();
        System.out.println(personagem2);
    }
}
