# SD-Coding 2018.1

## 1. FizzBuzz

_FizzBuzz_ é um jogo popular nos EUA para ensinar divisão a crianças. Nele, os jogadores contam incrementalmente, substituindo os números divisíveis por 3 por "Fizz" e os divisíveis por 5 por "Buzz". Números divisíveis por 3 e 5 ao mesmo tempo devem ser substituídos por "FizzBuzz".

Implemente a função _FizzBuzz_ conforme definida abaixo. A mesma deve receber dois números inteiros não negativos (start e end) e imprimir a partir de start (incluído) até end (excluído) seguindo a mesma lógica do FizzBuzz.

**Input:** inteiros (start < end) determinando os números de início e fim da contagem.
**Output:** a partir de start (incluído) até end (excluído) seguindo a mesma lógica do FizzBuzz, separado por linha
> void fizzBuzz (int start, int end){
    ... 
}

### Exemplo
**Input:**
```
1 16
```
**Output:**
```
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
```

## 2. Palíndromo

Palíndromos são palavras ou frases que são lidas da mesma forma tanto da esquerda para a direita quanto da direita para a esquerda.

Escreva uma função que analisa uma dada palavra ou frase, retornando se a mesma é um palíndromo ou não.
**Input:** array de caracteres em minúsculo da palavra ou frase a ser analisada.
**Output:** "{palavra} **_É_** palindromo" se a sentença é um palíndromo, "{palavra} **_NÃO_** e palíndromo" caso negativo.
> bool isPalindrome (String sentence){
    ... 
}

### Exemplo
**Input:**
```
apos a sopa
arara
cesar
```
**Output:**
```
apos a sopa E palíndromo
arara E palíndromo
cesar NAO e palíndromo
```

## 3. Fibonacci

A Sequência de _Fibonacci_ é uma sequência de números inteiros, começando por 0 e 1, na qual, cada termo subsequente corresponde à soma dos dois anteriores.

Defina uma função que recebe um número N e imprime pela serial os N primeiros números na sequência de Fibonacci:

**Input:** valor inteiro via Serial.
**Output:** sequencia de números inteiros, onde cada termo subsequente corresponde à soma dos dois anteriores
> void fibonacci(int valor){
    ... 
}

### Exemplo
**Input:**
```
3
6
9
```
**Output:**
```
0, 1, 1
0, 1, 1, 2, 3, 5
0, 1, 1, 2, 3, 5, 8, 13, 21
```
