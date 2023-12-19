package Prototype;

public class Main {
    public static void main(String[] args) {

        // Criando um Objeto Administrador original
        Usuario adminOriginal = new Administrador("Admin1", "admin@example.com");

        // Criando uma cópia do Objeto Administrador usando clone()
        Usuario adminCopia = adminOriginal.clone();


        // Exibindo as informações do Administrador original e da cópia
        System.out.println("Admin Original: " + adminOriginal.getNome() + ", " + adminOriginal.getEmail());
        System.out.println("Admin Cópia: " + adminCopia.getNome() + ", " + adminCopia.getEmail());

    }

}
