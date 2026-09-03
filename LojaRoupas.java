package flamingo.aprendendo.basico.estruturaswitch;

import java.util.Scanner;

public class LojaRoupas {

    public static void main(String[] args) {

        int tipoProduto;
        int quantidade;
        double preco, total, desconto, valorFinal;

        Scanner sc = new Scanner(System.in);

        System.out.printf("""
                O que deseja comprar?
                1) Camiseta - R$ 49,90
                2) Calça - R$ 119,90
                3) Jaqueta - R$ 199,90
                4) Tênis - R$ 249,90
                """);

        tipoProduto = sc.nextInt();

        switch (tipoProduto) {

            case 1:
                System.out.println("Quantas camisetas deseja?");
                quantidade = sc.nextInt();

                preco = 49.90;
                total = preco * quantidade;

                if (quantidade >= 3) {
                    desconto = total * 0.15;
                } else {
                    desconto = 0;
                }

                valorFinal = total - desconto;

                System.out.println("Produto escolhido: Camiseta");
                System.out.printf("Quantidade: %d%n", quantidade);
                System.out.printf("Desconto aplicado: %.0f%%%n", desconto > 0 ? 15.0 : 0.0);
                System.out.printf("Valor final: R$ %.2f%n", valorFinal);
                break;

            case 2:
                System.out.println("Quantas calças deseja?");
                quantidade = sc.nextInt();

                preco = 119.90;
                total = preco * quantidade;

                if (quantidade >= 3) {
                    desconto = total * 0.15;
                } else {
                    desconto = 0;
                }

                valorFinal = total - desconto;

                System.out.println("Produto escolhido: Calça");
                System.out.printf("Quantidade: %d%n", quantidade);
                System.out.printf("Desconto aplicado: %.0f%%%n", desconto > 0 ? 15.0 : 0.0);
                System.out.printf("Valor final: R$ %.2f%n", valorFinal);
                break;

            case 3:
                System.out.println("Quantas jaquetas deseja?");
                quantidade = sc.nextInt();

                preco = 199.90;
                total = preco * quantidade;

                if (quantidade >= 3) {
                    desconto = total * 0.15;
                } else {
                    desconto = 0;
                }

                valorFinal = total - desconto;

                System.out.println("Produto escolhido: Jaqueta");
                System.out.printf("Quantidade: %d%n", quantidade);
                System.out.printf("Desconto aplicado: %.0f%%%n", desconto > 0 ? 15.0 : 0.0);
                System.out.printf("Valor final: R$ %.2f%n", valorFinal);
                break;

            case 4:
                System.out.println("Quantos tênis deseja?");
                quantidade = sc.nextInt();

                preco = 249.90;
                total = preco * quantidade;

                if (quantidade >= 3) {
                    desconto = total * 0.15;
                } else {
                    desconto = 0;
                }

                valorFinal = total - desconto;

                System.out.println("Produto escolhido: Tênis");
                System.out.printf("Quantidade: %d%n", quantidade);
                System.out.printf("Desconto aplicado: %.0f%%%n", desconto > 0 ? 15.0 : 0.0);
                System.out.printf("Valor final: R$ %.2f%n", valorFinal);
                break;

            default:
                System.out.println("Produto inválido");
                break;
        }

        sc.close();
    }
}