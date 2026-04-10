#include <iostream>
#include <vector>
using namespace std;

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

    cout << "\nRELATORIO FINAL\n";

    for (int i = 0; i < 3; i++) {
        if (quantidades[i] < 5) {
            cout << "Produto: " << nomes[i] << " [REPOSICAO NECESSARIA] | Estoque: " << quantidades[i] << " unidades\n";
        } else {
            cout << "Produto: " << nomes[i] << " | Estoque: " << quantidades[i] << " unidades\n";
        }
    }

    return 0;
}
