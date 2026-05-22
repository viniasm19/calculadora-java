import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("=== CALCULADORA ===");
        System.out.print("Digite o primeiro número: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double b = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        double resultado = 0;

        if (opcao == 1) {
            resultado = calc.somar(a, b);
        } else if (opcao == 2) {
            resultado = calc.subtrair(a, b);
        } else if (opcao == 3) {
            resultado = calc.multiplicar(a, b);
        } else if (opcao == 4) {
            resultado = calc.dividir(a, b);
        } else {
            System.out.println("Opção inválida!");
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
