<h1> Busca Binária Recursiva </h1>
Implemente um programa que leia uma sequência ordenada de inteiros e um número N e verifica se N está na sequência lida. Seu programa deve fazer uma busca binária na sequência.

<br>
<br>

<h3>Importante! Seu programa deve ser recursivo.</h3>

<br>

<h2>Entrada</h2>
Seu programa deve ler da entrada duas linhas: a primeira é linha contendo uma sequência de inteiros separados por espaço, enquanto a segunda é um número N a ser pesquisado na sequência.

<h2>Saída</h2>
Seu programa deve imprimir (separadamente em cada linha) os índices visitados até o fim da execução do algoritmo. Caso não encontre N, deve imprimir o último índice como sendo -1.

<h2>Exemplo de execução</h2>

```java
$ javac Solution.java; java Solution
3 5 8 10 12 18 20
99
3
5
6
-1
$


$ javac Solution.java; java Solution
3 5 8 10 12 18
3
2
0 
$
```

<h2>Restrições</h2>
Você não pode usar coleção ou método algum do Collections framework. Sua implementação deve ser baseada em arrays.
