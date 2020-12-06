def shift(vetor, valor):
    vetor_new = []
    x = 0
    elementos = len(vetor)
    while valor < elementos:
        print(vetor[valor])
        valor = valor + 1
        elementos = elementos - 1

    while valor > elementos:
        print(vetor[valor])
        valor = valor - 1
        elementos = elementos + 1

if __name__ == "__main__":

    vet = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    shift(vet, 1)
