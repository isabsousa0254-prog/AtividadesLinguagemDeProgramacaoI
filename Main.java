import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome_do_produto;
        int quantidade_em_estoque;
        double preco_unitario;

        System.out.print("Digite o nome do produto: ");
        nome_do_produto = scanner.nextLine();

        System.out.print("Digite a quantidade em estoque: ");
        quantidade_em_estoque = scanner.nextInt();

        if (quantidade_em_estoque < 0) {
            System.out.println("Erro: A quantidade não pode ser negativa. Tente novamente.");
        } else {
            System.out.print("Digite o preço unitário: ");
            preco_unitario = scanner.nextDouble();

            System.out.println("\nRESUMO DO PRODUTO");
            System.out.println("Nome: " + nome_do_produto);
            System.out.println("Quantidade: " + quantidade_em_estoque);
            System.out.printf("Preço unitário: R$ %.2f%n", preco_unitario);
        }

        scanner.close();
    }
}