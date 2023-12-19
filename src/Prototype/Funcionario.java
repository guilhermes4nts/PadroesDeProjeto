package Prototype;

public class Funcionario extends Usuario{
    public Funcionario(String nome, String email){
        super(nome, email);
    }
    @Override
    public Usuario clone() {
        return new Funcionario(this.getNome(), this.getEmail());
    }
}
