# Função para verificar estoque crítico
def verificar_estoque_critico(quantidade):
    if quantidade < 5:
        return " [REPOSIÇÃO NECESSÁRIA]"
    return ""

# Função para exibir cabeçalho
def exibir_cabecalho():
    print("   SORVETERIA DO DENER 🍦 | CONTROLE DE ESTOQUE  ")

nomes = []
quantidades = []

# Cadastro de produtos
for i in range(3):
    nome = input(f"Digite o nome do produto {i+1}: ")

    while True:
        qtd = int(input(f"Digite a quantidade de {nome}: "))
        if qtd < 0:
            print("Erro: o estoque não pode ser negativo. Tente novamente.")
        else:
            break

    nomes.append(nome)
    quantidades.append(qtd)

exibir_cabecalho()

print("\nRELATÓRIO FINAL")

i = 0
while i < len(nomes):
    aviso = verificar_estoque_critico(quantidades[i])

    print(f"Produto: {nomes[i]}{aviso} | Estoque: {quantidades[i]} unidades")

    i += 1