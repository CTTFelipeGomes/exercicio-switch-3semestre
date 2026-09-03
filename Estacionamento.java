package flamingo.aprendendo.basico.estruturaswitch;

import java.util.Scanner;

public class Estacionamento {

    public static void main(String[] args) {

        int tipoVeiculo;
        int horas;
        double preco, total, taxaAdicional;

        Scanner sc = new Scanner(System.in);

        System.out.printf("""
                O que deseja estacionar?
                1) Moto - R$ 5,00 por hora
                2) Carro - R$ 10,00 por hora
                3) Caminhonete - R$ 15,00 por hora
                """);

        tipoVeiculo = sc.nextInt();

        switch (tipoVeiculo) {

            case 1:
                System.out.println("Quantas horas o veículo ficará estacionado?");
                horas = sc.nextInt();

                preco = 5.00;
                total = preco * horas;

                if (horas > 5) {
                    taxaAdicional = 10.00;
                } else {
                    taxaAdicional = 0;
                }

                total = total + taxaAdicional;

                System.out.println("Veículo: Moto");
                System.out.printf("Horas estacionado: %d%n", horas);
                System.out.printf("Taxa adicional: R$ %.2f%n", taxaAdicional);
                System.out.printf("Valor total: R$ %.2f%n", total);
                break;

            case 2:
                System.out.println("Quantas horas o veículo ficou estacionado?");
                horas = sc.nextInt();

                preco = 10.00;
                total = preco * horas;

                if (horas > 5) {
                    taxaAdicional = 10.00;
                } else {
                    taxaAdicional = 0;
                }

                total = total + taxaAdicional;

                System.out.println("Veículo: Carro");
                System.out.printf("Horas estacionado: %d%n", horas);
                System.out.printf("Taxa adicional: R$ %.2f%n", taxaAdicional);
                System.out.printf("Valor total: R$ %.2f%n", total);
                break;

            case 3:
                System.out.println("Quantas horas o veículo ficou estacionado?");
                horas = sc.nextInt();

                preco = 15.00;
                total = preco * horas;

                if (horas > 5) {
                    taxaAdicional = 10.00;
                } else {
                    taxaAdicional = 0;
                }

                total = total + taxaAdicional;

                System.out.println("Veículo: Caminhonete");
                System.out.printf("Horas estacionado: %d%n", horas);
                System.out.printf("Taxa adicional: R$ %.2f%n", taxaAdicional);
                System.out.printf("Valor total: R$ %.2f%n", total);
                break;

            default:
                System.out.println("Tipo de veículo inválido");
                break;
        }

        sc.close();
    }
}
