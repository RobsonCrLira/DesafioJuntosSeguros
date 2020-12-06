# Questão 1

1 . Desenvolva utilizando estruturas de repetição, uma função que receba um vetor e um inteiro por parâmetro, e realize um shift no vetor do tamanho do número inteiro recebido.
O tamanho do shift deverá aceitar números negativos também. O sinal do tamanho servirá para definir a direção do shift.

Números positivos indicam o shift da direita para a esquerda.

Números negativos indicam o shift da esquerda para a direita.

Exemplos de funcionamento da função:
|vetor de entrada|chamada da fução|resultado esperado|
|-|-|-|
|[0,1,2,3,4,5,6,7,8,9]|shift(vetor_de_entrada, 1)|[9,0,1,2,3,4,5,6,7,8]|
|[0,1,2,3,4,5,6,7,8,9]|shift(vetor_de_entrada, 2)|[8,9,0,1,2,3,4,5,6,7]|
|[0,1,2,3,4,5,6,7,8,9]|shift(vetor_de_entrada, -1)|[1,2,3,4,5,6,7,8,9,0]|
|[0,1,2,3,4,5,6,7,8,9]|shift(vetor_de_entrada, -2)|[2,3,4,5,6,7,8,9,0,1]|
