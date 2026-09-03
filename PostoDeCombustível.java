package flamingo.aprendendo.basico.estruturaswitch;

import java.util.Scanner;

public class PostoDeCombustível {

    public static void main(String[] args) {

        byte tipoCombustivel;
        double litros, preco;

        Scanner sc = new Scanner(System.in);

        System.out.printf("""
                1) Gasolina
                2) Etanol
                3) Diesel
                """);
        tipoCombustivel = sc.nextByte();

        switch (tipoCombustivel){
            case 1:
                System.out.println("Quantos litros de gasolina você deseja?");
                litros = sc.nextDouble();
                preco = 5.89 * litros;
                System.out.printf("O preço total do combustível é R$%.2f%n", preco);
                break;

            case 2:
                System.out.println("Quantos litros de etanol você deseja?");
                litros = sc.nextDouble();
                preco = 3.99 * litros;
                System.out.printf("O preço total do combustível é R$%.2f%n", preco);
                break;

            case 3:
                System.out.println("Quantos litros de diesel você deseja?");
                litros = sc.nextDouble();
                preco = 6.19 * litros;
                System.out.printf("O preço total do combustível é R$%.2f%n", preco);
                break;

            default:
                System.out.println("Não existe esta opção!");
                break;
        }
        sc.close();
    }
}

