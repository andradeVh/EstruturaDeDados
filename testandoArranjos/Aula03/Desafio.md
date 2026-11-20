### Durante a execução, observe o comportamento da pilha. Explique, com suas palavras, o que acontece com a pilha quando o algoritmo:

#### Encontra uma nova posição que pode ser explorada
* As coordenadas das posições vizinhas são armazenadas na pilha

#### Chega a um caminho sem saída
* Desempilha até encontrar posições válidas novamente

#### Precisa retornar a uma bifurcação
* Desempilha até encontrar uma bifurcação com posições não visitadas

#### Encontra o destino
* Sai do loop imediatamente, finalizando o processo de busca com sucesso


### Considerando um labirinto com L linhas e C colunas, determine complexidade de tempo do algoritmo no pior caso e justifique sua resposta.

* Complexidade O(L x C), pois o pior caso é quando percorremos todas as casas acessíveis do labirinto e apenas o último alvo é o que desejamos