produtos = []

while True:
    print("\nMENU")
    print("1. Adicionar novo produto")
    print("2. Listar produtos em estoque")
    print("3. Sair")

    opcao = int(input("Escolha uma opção: "))

    if opcao == 1:
        nome = input("Nome do produto: ")
        
        quantidade = int(input("Quantidade: "))
        while quantidade < 0:
            print("Quantidade não pode ser negativa!")
            quantidade = int(input("Digite novamente: "))
        
        preco = float(input("Preço: "))

        produtos.append({
            "nome": nome,
            "quantidade": quantidade,
            "preco": preco
        })

        print("Produto adicionado com sucesso!")

    elif opcao == 2:
        if len(produtos) == 0:
            print("Nenhum produto cadastrado.")
        else:
            print("\nESTOQUE")
            for p in produtos:
                print(f"Nome: {p['nome']}, Quantidade: {p['quantidade']}, Preço: R$ {p['preco']:.2f}")

    elif opcao == 3:
        print("Execução encerrada.")
        break

    else:
        print("Opção inválida!")