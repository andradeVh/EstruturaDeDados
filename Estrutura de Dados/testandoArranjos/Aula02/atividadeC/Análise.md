## 1. Por que essa abordagem usando um array de instâncias da classe Vetor torna a busca de um contato mais rápida em comparação com a versão anterior (uma única lista contendo todos os contatos)?

- R: Pq ela divide o problema em varios subconjuntos menores. Com uma lista única, precisamos percorrer todos os elementos da agenda (pior caso, O(n)). Mas usando um array de array, a primeira letra do nome funciona como uma chave de acesso direto (de 0 a 25), o que permite acessar instantaneamente(O(1)) o vetor correspondente, que contém um porção muito menor dos dados, reduzindo o número de comparações necessárias





## 2. O que acontece com o desempenho da busca se a maioria dos contatos cadastrados começar com a mesma letra (ex: centenas de nomes iniciando com a letra "M")? O sistema continuará rápido? Justifique.

- R: Não, o desempenho com certeza será ferido. Se a grande maioria dos contatos se concentrar em uma única letra, o vetor daquela posição ficará inflado em comparação aos demais. Como a busca daquele vetor continua sendo sequencial, o tempo de busca voltará a se aproximar de O(número de contatos da letra), comportando-se praticamente como uma lista única.