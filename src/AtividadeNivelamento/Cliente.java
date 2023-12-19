package AtividadeNivelamento;

import java.util.Scanner;

public class Cliente {
    private static Exception NullPointerException;

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();
        int opc;

        do {
            Menu();
            opc = ler.nextInt();

            switch (opc) {
                case 1:
                    biblioteca.mostrarUsuarios();
                    break;

                case 2:
                    biblioteca.mostrarLivrosDisponíveis();
                    break;

                case 3:
                    System.out.println("Entre com o Id do Usuário:");
                    int iduser = ler.nextInt();

                    try {
                        biblioteca.buscarUsuario(iduser).estadoUsuario();
                    }catch (Exception e){
                        System.out.println("Entrada Inválida!!");
                    }
                    break;

                case 4:
                    System.out.println("Entre com o Id do Livro:");
                    int idlivro = ler.nextInt();
                    try {
                        biblioteca.buscarLivro(idlivro).estadoAtual();
                    }catch (Exception e){
                        System.out.println("Entrada Inválida!!");
                    }
                    break;
                case 5:
                    System.out.println("Entre com o Id do usuario: ");
                    iduser = ler.nextInt();
                    System.out.println("Entre com o Id do livro: ");
                    idlivro = ler.nextInt();

                    try {
                        biblioteca.emprestarLivro(biblioteca.buscarUsuario(iduser), biblioteca.buscarLivro(idlivro));
                        System.out.println("------------------------------------");
                        System.out.println("Livro Emprestado com Sucesso!!");
                        biblioteca.buscarUsuario(iduser).estadoUsuario();
                    }catch (LivroJaEmprestado e){
                        System.out.println(e.getMessage());
                    }catch (NullPointerException e){
                        System.out.println("ID de Usuário ou Livro Inválido!");
                    }

                    break;

                case 6:
                    System.out.println("Entre com o Id do Usuário: ");
                    iduser = ler.nextInt();
                    System.out.println("Entre com o Id do Livro: ");
                    idlivro = ler.nextInt();

                    try {
                        biblioteca.devolverLivro(biblioteca.buscarUsuario(iduser), biblioteca.buscarLivro(idlivro));
                        System.out.println("------------------------------------");
                        System.out.println("Livro Devolvido com Sucesso!!");
                        biblioteca.buscarUsuario(iduser).estadoUsuario();
                    }catch (LivroNaoEmprestado e){
                        System.out.println(e.getMessage());
                    }catch (NullPointerException e){
                        System.out.println("ID de Usuário ou Livro Inválido!");
                    }
                    break;

                case 7:
                    System.out.println("Entre com o nome do Livro:");
                    String titulo = ler.next();
                    biblioteca.buscarLivroPorTitulo(titulo);
                    break;

                default:
                    if (opc != 0) {
                        System.out.println("Opção Invalida!");
                    } else {
                        System.out.println("Encerrando o programa!");
                    }
            }
        } while (opc != 0);
    }

    public static void Menu(){
        System.out.println("============================");
        System.out.println("       MENU DE OPCOES");
        System.out.println("============================");
        System.out.println("1- Lista de Usuários");
        System.out.println("2- Lista de Livros Disponíveis");
        System.out.println("3- Consultar Estado do Usuário");
        System.out.println("4- Consultar Estado do Livro");
        System.out.println("5- Emprestar Livros");
        System.out.println("6- Devolver Livros");
        System.out.println("7- Buscar Livro po Título");
        System.out.println("0- Sair");
        System.out.println("Entre com a opcao de desejada:");
    }

}
