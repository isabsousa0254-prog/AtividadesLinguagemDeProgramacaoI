#include <iostream>
#include <vector>
using namespace std;

string verificar_estoque_critico(int quantidade) {
    if (quantidade < 5) {
        return " [REPOSICAO NECESSARIA]";
    }
    return "";
}

void exibir_cabecalho() {
    cout << "   SORVETERIA DO DENER | CONTROLE DE ESTOQUE   \n";
}

int main() {
    vector<string> nomes;
    vector<int> quantidades;

    for (int i = 0; i < 3; i++) {
        string nome;
        int qtd;

        cout << "Digite o nome do produto " << i+1 << ": ";
        cin >> nome;

        do {
            cout << "Digite a quantidade de " << nome << ": ";
            cin >> qtd;

            if (qtd < 0) {
                cout << "Erro: o estoque nao pode ser negativo. Tente novamente.\n";
            }

        } while (qtd < 0);

        nomes.push_back(nome);
        quantidades.push_back(qtd);
    }

    exibir_cabecalho();

    cout << "\nRELATORIO FINAL\n";

    int i = 0;
    while (i < nomes.size()) {
        string aviso = verificar_estoque_critico(quantidades[i]);

        cout << "Produto: " << nomes[i] << aviso
             << " | Estoque: " << quantidades[i] << " unidades\n";

        i++;
    }

    return 0;
}
