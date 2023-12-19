package Prototype;

public class Administrador extends Usuario {
    public Administrador(String nome, String email) {
        super(nome, email);
    }

    @Override
    public Usuario clone(){
        return new Administrador(this.getNome(), this.getEmail());
    }

}
