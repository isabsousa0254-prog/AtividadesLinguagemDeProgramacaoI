nome_do_produto = input("Digite o nome do produto: ")
quantidade_em_estoque = int(input("Digite a quantidade em estoque: "))

if quantidade_em_estoque < 0:
    print("Erro: A quantidade não pode ser um valor negativo. Por favor, tente novamente.")
else:
    preco_unitario = float(input("Digite o preço unitário: "))

    print("\nRESUMO DO PRODUTO")
    print("Nome:", nome_do_produto)
    print("Quantidade:", quantidade_em_estoque)
    print(f"Preço unitário: R$ {preco_unitario:.2f}")