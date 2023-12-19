package Prototype;

public class Cliente extends Usuario {

    public Cliente(String nome, String email){
        super(nome, email);
    }
    @Override
    public Usuario clone() {
        return new Cliente(this.getNome(), this.getEmail());
    }
}
