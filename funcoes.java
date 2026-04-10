import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static String verificar_estoque_critico(int quantidade) {
        if (quantidade < 5) {
            return " [REPOSICAO NECESSARIA]";
        }
        return "";
    }

    public static void exibir_cabecalho() {
        System.out.println("   SORVETERIA DO DENER 🍦 | CONTROLE DE ESTOQUE     ");
    }

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

        exibir_cabecalho();

        System.out.println("\nRELATORIO FINAL");

        int i = 0;
        while (i < nomes.size()) {
            String aviso = verificar_estoque_critico(quantidades.get(i));

            System.out.println("Produto: " + nomes.get(i) + aviso +
                    " | Estoque: " + quantidades.get(i) + " unidades");

            i++;
        }

        sc.close();
    }
}