package flamingo.aprendendo.basico.estruturaswitch;

import java.util.Scanner;

public class SistemaPedidos {

    public static void main(String[] args) {

        int produto;
        int quantidade;
        boolean temAdicional;
        double preco, total;

        Scanner sc = new Scanner(System.in);

        System.out.printf("""
                Envie seu pedido:
                1) Açaí - R$ 18,00
                2) Sorvete - R$ 12,00
                3) Milkshake - R$ 20,00
                """);

        produto = sc.nextInt();

        System.out.println("Digite a quantidade:");
        quantidade = sc.nextInt();

        System.out.println("Deseja adicional? true = sim / false = não");
        temAdicional = sc.nextBoolean();

        switch (produto) {

            case 1:
                preco = 18.00;
                total = preco * quantidade;

                if (temAdicional) {
                    total = total + (5.00 * quantidade);
                }

                System.out.println("Produto escolhido: Açaí");
                System.out.printf("Quantidade: %d%n", quantidade);

                if (temAdicional) {
                    System.out.println("Adicional: Sim");
                } else {
                    System.out.println("Adicional: Não");
                }

                System.out.printf("Valor total: R$ %.2f%n", total);
                break;

            case 2:
                preco = 12.00;
                total = preco * quantidade;

                if (temAdicional) {
                    total = total + (5.00 * quantidade);
                }

                System.out.println("Produto escolhido: Sorvete");
                System.out.printf("Quantidade: %d%n", quantidade);

                if (temAdicional) {
                    System.out.println("Adicional: Sim");
                } else {
                    System.out.println("Adicional: Não");
                }

                System.out.printf("Valor total: R$ %.2f%n", total);
                break;

            case 3:
                preco = 20.00;
                total = preco * quantidade;

                if (temAdicional) {
                    total = total + (5.00 * quantidade);
                }

                System.out.println("Produto escolhido: Milkshake");
                System.out.printf("Quantidade: %d%n", quantidade);

                if (temAdicional) {
                    System.out.println("Adicional: Sim");
                } else {
                    System.out.println("Adicional: Não");
                }

                System.out.printf("Valor total: R$ %.2f%n", total);
                break;

            default:
                System.out.println("Produto inválido");
                break;
        }

        sc.close();
    }
}