def shift(vetor, valor):
    vetor_new = []
    negativo = len(vetor) + valor
    positivo = len(vetor) - valor

    while valor < negativo:
        vetor_new.append(vetor[valor])
        valor = valor + 1

    while valor > positivo:
        vetor_new.append(vetor[valor])
        valor = valor - 1

    return vetor_new


if __name__ == "__main__":

    vet = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

    vet2 = shift(vet, -2)

    for i in vet2:
        print(i)


