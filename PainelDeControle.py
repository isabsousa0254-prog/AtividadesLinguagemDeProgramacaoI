nomes = []
quantidades = []

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

print("\nRELATÓRIO FINAL")

for i in range(3):
    if quantidades[i] < 5:
        print(f"Produto: {nomes[i]} [REPOSIÇÃO NECESSÁRIA] | Estoque: {quantidades[i]} unidades")
    else:
        print(f"Produto: {nomes[i]} | Estoque: {quantidades[i]} unidades")