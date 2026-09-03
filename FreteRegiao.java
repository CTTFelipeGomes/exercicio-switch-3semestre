package flamingo.aprendendo.basico.estruturaswitch;

import java.util.Scanner;

public class FreteRegiao {

    public static void main(String[] args) {

        int regiao;
        double valorProduto;
        double frete, valorFinal;

        Scanner sc = new Scanner(System.in);

        System.out.printf("""
                Selecione sua região:
                1) Sudeste - Frete R$ 20,00
                2) Sul - Frete R$ 25,00
                3) Nordeste - Frete R$ 35,00
                4) Norte - Frete R$ 45,00
                5) Centro-Oeste - Frete R$ 30,00
                """);

        regiao = sc.nextInt();

        switch (regiao) {

            case 1:
                System.out.println("Digite o valor do produto:");
                valorProduto = sc.nextDouble();

                if (valorProduto >= 300) {
                    frete = 0;
                } else {
                    frete = 20.00;
                }

                valorFinal = valorProduto + frete;

                System.out.println("Região: Sudeste");
                System.out.printf("Valor do produto: R$ %.2f%n", valorProduto);
                System.out.printf("Frete: R$ %.2f%n", frete);
                System.out.printf("Valor final: R$ %.2f%n", valorFinal);
                break;

            case 2:
                System.out.println("Digite o valor do produto:");
                valorProduto = sc.nextDouble();

                if (valorProduto >= 300) {
                    frete = 0;
                } else {
                    frete = 25.00;
                }

                valorFinal = valorProduto + frete;

                System.out.println("Região: Sul");
                System.out.printf("Valor do produto: R$ %.2f%n", valorProduto);
                System.out.printf("Frete: R$ %.2f%n", frete);
                System.out.printf("Valor final: R$ %.2f%n", valorFinal);
                break;

            case 3:
                System.out.println("Digite o valor do produto:");
                valorProduto = sc.nextDouble();

                if (valorProduto >= 300) {
                    frete = 0;
                } else {
                    frete = 35.00;
                }

                valorFinal = valorProduto + frete;

                System.out.println("Região: Nordeste");
                System.out.printf("Valor do produto: R$ %.2f%n", valorProduto);
                System.out.printf("Frete: R$ %.2f%n", frete);
                System.out.printf("Valor final: R$ %.2f%n", valorFinal);
                break;

            case 4:
                System.out.println("Digite o valor do produto:");
                valorProduto = sc.nextDouble();

                if (valorProduto >= 300) {
                    frete = 0;
                } else {
                    frete = 45.00;
                }

                valorFinal = valorProduto + frete;

                System.out.println("Região: Norte");
                System.out.printf("Valor do produto: R$ %.2f%n", valorProduto);
                System.out.printf("Frete: R$ %.2f%n", frete);
                System.out.printf("Valor final: R$ %.2f%n", valorFinal);
                break;

            case 5:
                System.out.println("Digite o valor do produto:");
                valorProduto = sc.nextDouble();

                if (valorProduto >= 300) {
                    frete = 0;
                } else {
                    frete = 30.00;
                }

                valorFinal = valorProduto + frete;

                System.out.println("Região: Centro-Oeste");
                System.out.printf("Valor do produto: R$ %.2f%n", valorProduto);
                System.out.printf("Frete: R$ %.2f%n", frete);
                System.out.printf("Valor final: R$ %.2f%n", valorFinal);
                break;

            default:
                System.out.println("Região inválida");
                break;
        }

        sc.close();
    }
}