public class CalculadoraFinanceira {

    // Método que realiza o cálculo
    public void exibirProjecao(double principal, double aporteMensal, double taxaAnual, int anos) {
        double taxaMensal = (taxaAnual / 100) / 12;
        int meses = anos * 12;
        double montante = principal;

        System.out.println("\n--- Projeção Mensal ---");
        for (int i = 1; i <= meses; i++) {
            montante = (montante + aporteMensal) * (1 + taxaMensal);

            if (i % 12 == 0) {
                System.out.printf("Ano %d: R$ %.2f%n", (i / 12), montante);
            }
        }
        System.out.printf("\nTotal acumulado: R$ %.2f%n", montante);
    }
}