package flamingo.aprendendo.basico.estruturaswitch;

import java.util.Scanner;

public class IngressoCinema {

    public static void main(String[] args) {

        int tipoIngresso;
        int quantidade;
        double preco, total, desconto, valorFinal;

        Scanner sc = new Scanner(System.in);

        System.out.printf("""
                Escolha seu ingresso:
                1) Inteira - R$ 32,00
                2) Meia-entrada - R$ 16,00
                3) VIP - R$ 60,00
                """);

        tipoIngresso = sc.nextInt();

        switch (tipoIngresso) {

            case 1:
                System.out.println("Quantos ingressos deseja?");
                quantidade = sc.nextInt();

                preco = 32.00;
                total = preco * quantidade;

                if (quantidade > 4) {
                    desconto = total * 0.05;
                } else {
                    desconto = 0;
                }

                valorFinal = total - desconto;

                System.out.println("Tipo de ingresso: Inteira");
                System.out.printf("Quantidade: %d%n", quantidade);
                System.out.printf("Desconto aplicado: %.0f%%%n", desconto > 0 ? 5.0 : 0.0);
                System.out.printf("Valor final: R$ %.2f%n", valorFinal);
                break;

            case 2:
                System.out.println("Quantos ingressos deseja?");
                quantidade = sc.nextInt();

                preco = 16.00;
                total = preco * quantidade;

                if (quantidade > 4) {
                    desconto = total * 0.05;
                } else {
                    desconto = 0;
                }

                valorFinal = total - desconto;

                System.out.println("Tipo de ingresso: Meia-entrada");
                System.out.printf("Quantidade: %d%n", quantidade);
                System.out.printf("Desconto aplicado: %.0f%%%n", desconto > 0 ? 5.0 : 0.0);
                System.out.printf("Valor final: R$ %.2f%n", valorFinal);
                break;

            case 3:
                System.out.println("Quantos ingressos deseja?");
                quantidade = sc.nextInt();

                preco = 60.00;
                total = preco * quantidade;

                if (quantidade > 4) {
                    desconto = total * 0.05;
                } else {
                    desconto = 0;
                }

                valorFinal = total - desconto;

                System.out.println("Tipo de ingresso: VIP");
                System.out.printf("Quantidade: %d%n", quantidade);
                System.out.printf("Desconto aplicado: %.0f%%%n", desconto > 0 ? 5.0 : 0.0);
                System.out.printf("Valor final: R$ %.2f%n", valorFinal);
                break;

            default:
                System.out.println("Tipo de ingresso inválido");
                break;
        }

        sc.close();
    }
}
