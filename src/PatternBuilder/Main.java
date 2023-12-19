package PatternBuilder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        PersonagemBuilder builder = new PersonagemBuilderImpl();

        // Construindo um personagem usando o Director
        director.construirPersonagem(builder);

        // Obtendo o personagem construído
        Personagem personagem = builder.getPersonagem();

        // Exibindo as informações do personagem usando o método toString()
        System.out.println(personagem.toString());
    }
}
