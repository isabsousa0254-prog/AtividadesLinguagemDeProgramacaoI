#include <iostream>
#include <iomanip>
using namespace std;
int main() {
    string nome_do_produto;
    int quantidade_em_estoque;
    float preco_unitario;

    cout << "Digite o nome do produto: ";
    getline(cin, nome_do_produto);

    cout << "Digite a quantidade em estoque: ";
    cin >> quantidade_em_estoque;

    if (quantidade_em_estoque < 0) {
        cout << "Erro: A quantidade nao pode ser negativa. Tente novamente." << endl;
    } else {
        cout << "Digite o preco unitario: ";
        cin >> preco_unitario;

        cout << "RESUMO DO PRODUTO" << endl;
        cout << "Nome: " << nome_do_produto << endl;
        cout << "Quantidade: " << quantidade_em_estoque << endl;
        cout << "Preco unitario: R$ "
             << fixed << setprecision(2) << preco_unitario << endl;
    }

    return 0;
}
