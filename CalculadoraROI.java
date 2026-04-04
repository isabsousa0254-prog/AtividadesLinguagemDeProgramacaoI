import java.util.Scanner;

public class CalculadoraROI {

    public static double calcularROI(double ganho, double investimento) {
        return (ganho - investimento) / investimento;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do investimento: ");
        double investimento = scanner.nextDouble();

        if (investimento == 0) {
            System.out.println("Erro: o investimento nao pode ser 0.");
        } else {
            System.out.print("Digite o valor do ganho: ");
            double ganho = scanner.nextDouble();

            double roi = calcularROI(ganho, investimento);
            System.out.println("ROI: " + roi + " (" + (roi * 100) + "%)");
        }

        scanner.close();
    }
}