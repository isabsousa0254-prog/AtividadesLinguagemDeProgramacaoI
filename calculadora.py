def calcular_roi(ganho, investimento):
    return (ganho - investimento) / investimento

investimento = float(input("Digite o valor do investimento: "))

if investimento == 0:
    print("Erro: O investimento não pode ser 0.")
else:
    ganho = float(input("Digite o valor do ganho: "))
    
    roi = calcular_roi(ganho, investimento)
    print(f"ROI: {roi:.2f} ({roi * 100:.2f}%)")