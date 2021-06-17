<h1> Fila (Linked List) </h1>
Implemente uma fila baseada em uma linked list (duplamente encadeada). Seus algoritmos devem ser recursivos.

<br>
<br>

<h2>Entrada</h2>
Seu programa deve ler da entrada uma série de operações (add, remove, element, search e print). A leitura de operações deve ser encerrada com a palavra ```end```

<h2>Saída</h2>
Seu programa deve imprimir o conteúdo da fila sempre que uma operação print for lida. Se a fila estiver vazia, imprima ``` empty ``` . <br>
Seu programa deve imprimir o elemento inicial da fila quando ler a operação element. Se a lista estiver vazia, imprima ``` "empty" ```. <br>
Se a fila estiver vazia e for lida a operação remove, imprima ```"empty"```. <br>
A operação search retorna a primeira posição (iniciando de 0) em que o elemento aparece na fila. Caso a fila não contenha o elemento imprima ``` -1 ```.

<h2>Exemplo de execução</h2>

```java
$ javac Solution.java; java Solution
print
empty
add 2
element
2
add 5
print
2 5
remove
print
5
add 11
add 18
add 20
search 18
2
remove
print
11 18 20
remove
remove
remove
remove
empty
end

$ javac Solution.java; java Solution
search 8
-1
add 9
search 9
0
add 8
search 9
0
search 8
1
remove
search 9
-1
end
```

<h2>Restrições</h2>
Você não pode usar coleção ou método algum do Collections framework. Sua implementação deve em nós ligados por referência.

Dica: Crie a classe Fila para organizar o seu código.

Lembre-se: tst vai testar apenas a entrada e saída do seu programa. Isso significa que você deve construir o main que leia os dados da entrada padrão manipula a sua Fila e imprime o que se espera na saída.
