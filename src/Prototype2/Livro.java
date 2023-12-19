package Prototype2;

class Livro implements LivroPrototype {
    private String titulo;
    private String categoria;
    private String dedicatoria;

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDedicatoria() {
        return dedicatoria;
    }

    public Livro(String titulo, String categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.dedicatoria = "";
    }

    @Override
    public LivroPrototype clone() {
        return new Livro(this.titulo, this.categoria);
    }

    @Override
    public LivroPrototype setDedicatory(String dedicatory) {
        this.dedicatoria = dedicatory;
        return null;
    }

    @Override
    public void imprimir() {
        System.out.println("Livro: " + getTitulo());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Dedicatória: " + getDedicatoria());
        System.out.println();
    }
}
