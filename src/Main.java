import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciamos a nossa lógica
        CalculadoraFinanceira calc = new CalculadoraFinanceira();

        System.out.println("=== Bem-vindo ao Gestor Financeiro ===");

        System.out.print("Valor inicial (R$): ");
        double principal = scanner.nextDouble();

        System.out.print("Aporte mensal (R$): ");
        double aporteMensal = scanner.nextDouble();

        System.out.print("Taxa de juros anual (%): ");
        double taxaAnual = scanner.nextDouble();

        System.out.print("Tempo em anos: ");
        int anos = scanner.nextInt();

        // O Main chama o serviço de cálculo
        calc.exibirProjecao(principal, aporteMensal, taxaAnual, anos);

        scanner.close();
    }
}
