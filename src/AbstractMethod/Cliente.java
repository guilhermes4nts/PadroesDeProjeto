package AbstractMethod;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Logistica logistica = new Logistica();
        int estilo;

        do {
            System.out.println("Menu de Opcoes: ");
            System.out.println("1- Criar Cadeira");
            System.out.println("2- Criar Mesa de Centro");
            System.out.println("3- Criar Sofá");
            System.out.println("0- Sair");
            System.out.println("Entre com a Opção Desejada:");
            estilo = ler.nextInt();

            switch (estilo){

                case 1:
                    menu();
                    int tipo = ler.nextInt();
                    logistica.fabricarMovel(estilo, tipo);
                    break;
                case 2, 3:
                    menu();
                    tipo = ler.nextInt();
                    logistica.fabricarMovel(estilo, tipo);
                    break;
                default:
                    if ( estilo == 0){
                        System.out.println("Programa Encerrado!");
                    }else {
                        System.out.println("Opção Inválida!");
                    }
            }

        }while (estilo != 0);
    }

    public static void menu(){
        System.out.println("Agora Escolha o tipo do Móvel");
        System.out.println("1- Moderno");
        System.out.println("2- Vitoriano");
        System.out.println("3- ArtDeco");
        System.out.println("Entre com a Opção Desejada:");
    }
}
