package Prototype2;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Andson");
        nomes.add("Guilherme");
        nomes.add("Mateus");

        LivroPrototype livroPrototype = new Livro("Harry Potter", "Fantasia");

        for (String nome : nomes) {
            LivroPrototype novoLivro = livroPrototype.clone();
            novoLivro.setDedicatory("Para " + nome);
            novoLivro.imprimir();
        }
    }
}
