package flamingo.aprendendo.basico.estruturaswitch;
import java.util.Scanner;

public class BanhoETosa {

    public static void main(String[] args) {

        int tipoServico;
        int porteAnimal;
        double preco;

        Scanner sc = new Scanner(System.in);

        System.out.printf("""
                Escolha o seviço desejado:
                1) Banho
                2) Tosa
                3) Banho e tosa
                """);

        tipoServico = sc.nextInt();

        System.out.printf("""
                
                PORTES
                1) Pequeno
                2) Médio
                3) Grande
                """);

        porteAnimal = sc.nextInt();

        switch (tipoServico) {

            case 1:

                switch (porteAnimal) {

                    case 1:
                        preco = 40.00;
                        System.out.println("Serviço escolhido: Banho");
                        System.out.println("Porte do animal: Pequeno");
                        System.out.printf("Valor total: R$ %.2f%n", preco);
                        break;

                    case 2:
                        preco = 55.00;
                        System.out.println("Serviço escolhido: Banho");
                        System.out.println("Porte do animal: Médio");
                        System.out.printf("Valor total: R$ %.2f%n", preco);
                        break;

                    case 3:
                        preco = 70.00;
                        System.out.println("Serviço escolhido: Banho");
                        System.out.println("Porte do animal: Grande");
                        System.out.printf("Valor total: R$ %.2f%n", preco);
                        break;

                    default:
                        System.out.println("Porte do animal inválido");
                        break;
                }

                break;

            case 2:

                switch (porteAnimal) {

                    case 1:
                        preco = 50.00;
                        System.out.println("Serviço escolhido: Tosa");
                        System.out.println("Porte do animal: Pequeno");
                        System.out.printf("Valor total: R$ %.2f%n", preco);
                        break;

                    case 2:
                        preco = 65.00;
                        System.out.println("Serviço escolhido: Tosa");
                        System.out.println("Porte do animal: Médio");
                        System.out.printf("Valor total: R$ %.2f%n", preco);
                        break;

                    case 3:
                        preco = 80.00;
                        System.out.println("Serviço escolhido: Tosa");
                        System.out.println("Porte do animal: Grande");
                        System.out.printf("Valor total: R$ %.2f%n", preco);
                        break;

                    default:
                        System.out.println("Porte do animal inválido");
                        break;
                }

                break;

            case 3:

                switch (porteAnimal) {

                    case 1:
                        preco = 85.00;
                        System.out.println("Serviço escolhido: Banho e tosa");
                        System.out.println("Porte do animal: Pequeno");
                        System.out.printf("Valor total: R$ %.2f%n", preco);
                        break;

                    case 2:
                        preco = 110.00;
                        System.out.println("Serviço escolhido: Banho e tosa");
                        System.out.println("Porte do animal: Médio");
                        System.out.printf("Valor total: R$ %.2f%n", preco);
                        break;

                    case 3:
                        preco = 140.00;
                        System.out.println("Serviço escolhido: Banho e tosa");
                        System.out.println("Porte do animal: Grande");
                        System.out.printf("Valor total: R$ %.2f%n", preco);
                        break;

                    default:
                        System.out.println("Porte do animal inválido");
                        break;
                }

                break;

            default:
                System.out.println("Serviço inválido");
                break;
        }

        sc.close();
    }
}