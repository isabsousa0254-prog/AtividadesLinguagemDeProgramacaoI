#include <iostream>
using namespace std;

double calcularROI(double ganho, double investimento) {
    return (ganho - investimento) / investimento;
}

int main() {
    double investimento, ganho;

    cout << "Digite o valor do investimento: ";
    cin >> investimento;

    if (investimento == 0) {
        cout << "Erro: o investimento nao pode ser 0." << endl;
    } else {
        cout << "Digite o valor do ganho: ";
        cin >> ganho;

        double roi = calcularROI(ganho, investimento);
        cout << "ROI: " << roi << " (" << roi * 100 << "%)" << endl;
    }

    return 0;
}