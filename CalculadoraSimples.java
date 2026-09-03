package flamingo.aprendendo.basico.estruturaswitch;

public class CalculadoraSimples {

    public static void main(String[] args) {

        int operacao = 1;
        double numero01 = 20;
        double numero02 = 10;
        double resultado;

        switch (operacao) {

            case 1:
                resultado = numero01 + numero02;

                System.out.println("Operação escolhida: Soma");
                System.out.printf("Resultado: %.1f%n", resultado);
                break;

            case 2:
                resultado = numero01 - numero02;

                System.out.println("Operação escolhida: Subtração");
                System.out.printf("Resultado: %.1f%n", resultado);
                break;

            case 3:
                resultado = numero01 * numero02;

                System.out.println("Operação escolhida: Multiplicação");
                System.out.printf("Resultado: %.1f%n", resultado);
                break;

            case 4:

                if (numero02 == 0) {
                    System.out.println("Não é possível dividir por zero");
                } else {
                    resultado = numero01 / numero02;

                    System.out.println("Operação escolhida: Divisão");
                    System.out.printf("Resultado: %.1f%n", resultado);
                }

                break;

            default:
                System.out.println("Operação inválida");
                break;
        }
    }
}