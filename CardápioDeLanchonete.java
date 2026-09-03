package flamingo.aprendendo.basico.estruturaswitch;
import java.util.Scanner;
public class CardápioDeLanchonete {
    public static void main(String[] args) {

        int opcaoLanche;
        int quantidade;
        double preco, total;

        Scanner sc = new Scanner(System.in);

        System.out.printf("""
                Monte o seu pedido digitando o número de cada opção desejada:
                1) Hambúrguer - R$ 25,00
                2) Pizza - R$ 40,00
                3) Batata frita - R$ 18,00
                4) Refrigerante - R$ 8,00
                5) Suco - R$ 10,00
                """);

        opcaoLanche = sc.nextInt();

        switch (opcaoLanche) {

            case 1:
                System.out.println("Quantos hambúrgueres você deseja?");
                quantidade = sc.nextInt();
                preco = 25.00;
                total = preco * quantidade;

                System.out.printf("Item escolhido: Hambúrguer%n");
                System.out.printf("Quantidade: %d%n", quantidade);
                System.out.printf("Total do pedido: R$ %.2f%n", total);
                break;

            case 2:
                System.out.println("Quantas pizzas você deseja?");
                quantidade = sc.nextInt();
                preco = 40.00;
                total = preco * quantidade;

                System.out.printf("Item escolhido: Pizza%n");
                System.out.printf("Quantidade: %d%n", quantidade);
                System.out.printf("Total do pedido: R$ %.2f%n", total);
                break;

            case 3:
                System.out.println("Quantas batatas fritas você deseja?");
                quantidade = sc.nextInt();
                preco = 18.00;
                total = preco * quantidade;

                System.out.printf("Item escolhido: Batata frita%n");
                System.out.printf("Quantidade: %d%n", quantidade);
                System.out.printf("Total do pedido: R$ %.2f%n", total);
                break;

            case 4:
                System.out.println("Quantos refrigerantes você deseja?");
                quantidade = sc.nextInt();
                preco = 8.00;
                total = preco * quantidade;

                System.out.printf("Item escolhido: Refrigerante%n");
                System.out.printf("Quantidade: %d%n", quantidade);
                System.out.printf("Total do pedido: R$ %.2f%n", total);
                break;

            case 5:
                System.out.println("Quantos sucos você deseja?");
                quantidade = sc.nextInt();
                preco = 10.00;
                total = preco * quantidade;

                System.out.printf("Item escolhido: Suco%n");
                System.out.printf("Quantidade: %d%n", quantidade);
                System.out.printf("Total do pedido: R$ %.2f%n", total);
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }

        sc.close();
    }
}
