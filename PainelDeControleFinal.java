import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Integer> quantidades = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            String nome = sc.next();

            int qtd;
            do {
                System.out.print("Digite a quantidade de " + nome + ": ");
                qtd = sc.nextInt();

                if (qtd < 0) {
                    System.out.println("Erro: o estoque nao pode ser negativo. Tente novamente.");
                }

            } while (qtd < 0);

            nomes.add(nome);
            quantidades.add(qtd);
        }

        System.out.println("\nRELATORIO FINAL");

        for (int i = 0; i < 3; i++) {
            if (quantidades.get(i) < 5) {
                System.out.println("Produto: " + nomes.get(i) + " [REPOSICAO NECESSARIA] | Estoque: " + quantidades.get(i) + " unidades");
            } else {
                System.out.println("Produto: " + nomes.get(i) + " | Estoque: " + quantidades.get(i) + " unidades");
            }
        }

        sc.close();
    }
}