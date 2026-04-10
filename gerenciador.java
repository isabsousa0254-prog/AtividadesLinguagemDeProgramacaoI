import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    String nome;
    int quantidade;
    double preco;

    Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        while (true) {
            System.out.println("\nMENU");
            System.out.println("1. Adicionar novo produto");
            System.out.println("2. Listar produtos em estoque");
            System.out.println("3. Sair");

            int opcao = sc.nextInt();

            if (opcao == 1) {
                sc.nextLine();

                System.out.print("Nome do produto: ");
                String nome = sc.nextLine();

                System.out.print("Quantidade: ");
                int quantidade = sc.nextInt();
                while (quantidade < 0) {
                    System.out.println("Quantidade nao pode ser negativa!");
                    System.out.print("Digite novamente: ");
                    quantidade = sc.nextInt();
                }

                System.out.print("Preco: ");
                double preco = sc.nextDouble();

                produtos.add(new Produto(nome, quantidade, preco));
                System.out.println("Produto adicionado com sucesso!");

            } else if (opcao == 2) {
                if (produtos.isEmpty()) {
                    System.out.println("Nenhum produto cadastrado.");
                } else {
                    System.out.println("\nESTOQUE");
                    for (Produto p : produtos) {
                        System.out.printf("Nome: %s, Quantidade: %d, Preco: R$%.2f\n",
                                p.nome, p.quantidade, p.preco);
                    }
                }

            } else if (opcao == 3) {
                System.out.println("Execução encerrada");
                break;

            } else {
                System.out.println("Opcao invalida!");
            }
        }

        sc.close();
    }
}
