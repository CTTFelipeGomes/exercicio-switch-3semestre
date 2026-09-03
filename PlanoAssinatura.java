package flamingo.aprendendo.basico.estruturaswitch;

import java.util.Scanner;

public class PlanoAssinatura {

    public static void main(String[] args) {

        int plano;
        int meses;
        double preco, total, desconto, valorFinal;

        Scanner sc = new Scanner(System.in);

        System.out.printf("""
                Escolha um plano e digite o número:
                1) Plano Básico - R$ 29,90 por mês
                2) Plano Profissional - R$ 59,90 por mês
                3) Plano Premium - R$ 99,90 por mês
                """);

        plano = sc.nextInt();

        switch (plano) {

            case 1:
                System.out.println("Quantos meses deseja contratar?");
                meses = sc.nextInt();

                preco = 29.90;
                total = preco * meses;

                if (meses == 12) {
                    desconto = total * 0.10;
                } else {
                    desconto = 0;
                }

                valorFinal = total - desconto;

                System.out.println("Plano escolhido: Básico");
                System.out.printf("Meses contratados: %d%n", meses);
                System.out.printf("Desconto aplicado: %.0f%%%n", desconto > 0 ? 10.0 : 0.0);
                System.out.printf("Valor final: R$ %.2f%n", valorFinal);
                break;

            case 2:
                System.out.println("Quantos meses deseja contratar?");
                meses = sc.nextInt();

                preco = 59.90;
                total = preco * meses;

                if (meses == 12) {
                    desconto = total * 0.10;
                } else {
                    desconto = 0;
                }

                valorFinal = total - desconto;

                System.out.println("Plano escolhido: Profissional");
                System.out.printf("Meses contratados: %d%n", meses);
                System.out.printf("Desconto aplicado: %.0f%%%n", desconto > 0 ? 10.0 : 0.0);
                System.out.printf("Valor final: R$ %.2f%n", valorFinal);
                break;

            case 3:
                System.out.println("Quantos meses deseja contratar?");
                meses = sc.nextInt();

                preco = 99.90;
                total = preco * meses;

                if (meses == 12) {
                    desconto = total * 0.10;
                } else {
                    desconto = 0;
                }

                valorFinal = total - desconto;

                System.out.println("Plano escolhido: Premium");
                System.out.printf("Meses contratados: %d%n", meses);
                System.out.printf("Desconto aplicado: %.0f%%%n", desconto > 0 ? 10.0 : 0.0);
                System.out.printf("Valor final: R$ %.2f%n", valorFinal);
                break;

            default:
                System.out.println("Plano inválido");
                break;
        }

        sc.close();
    }
}
