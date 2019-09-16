# Programação Orientada a Objetos com Java - Lista 01

## INSTRUÇÕES:

- Todos requisitos da questão devem ser cumpridos para que a questão seja considerada correta
- A lista deve ser feita individualmente
- A entrega deve ser feita até o prazo estipulado, envios posteriores não serão
aceitos
- A entrega deve ser feita através de algum servidor de git
- Esta lista faz parte do conjunto de avaliações
- Crie um método main para cada uma das questões para testar as
funcionalidades implementadas
- Procure sempre seguir as melhores práticas de programação

## QUESTÕES

### 01: Calculadora

Implemente uma classe chamada `Calculadora` que contem 4 métodos:
- somar, subtrair, multiplicar e dividir

Cada método deve:
- receber 2 números reais como parâmetros
- retornar o resultado da operação, indicada pelo seu nome

Operadores:
- char soma = +
- char subtração = - 
- char multiplicação = *
- char divisão = /

Método main:
- os 2 números e a operação a ser executada devem ser
inseridas através do teclado

Ordem das operações:
- Subtração: primeiro parâmetro - segundo parâmetro
- Divisão: primeiro parâmetro / segundo parâmetro

### 02: Comparador

Implemente uma classe chamada `Comparador`, que:
- tem 3 atributos Inteiros
- tem métodos get e set para cada atributo
- tem um método `getMaior` que retorna o maior dos três valores

Método main:
- os 3 valores devem ser lidos do teclado

### 03: Medidas

Implemente uma classe chamada `Medidas` que possui os seguintes atributos (e seus devidos métodos `get` e `set`):
- String unidadeDeDistancia: `m` ou `mi`
- Real distancia
- String unidadeDeMassa: `kg` ou `lb`
- Real massa
- String unidadeDeTemperatura: `C` e `F`
- Inteiro temperatura

Esta classe deve ter:
- um construtor sem parâmetros
- um construtor que recebe como parâmetro seus 6 atributos

Crie uma segunda classe chamada `ConversorDeMedidas` que deve possuir os seguintes
métodos:
- converterMassa, converterTemperatura e converterDistancia

Cada um desses métodos deve:
- receber dois objetos do tipo `Medidas`
- realizar a conversão na ordem em que os parâmetros foram enviados

>> Por exemplo, for usado o metodo `converterMassa` e a primeira instância de `medidas` tiver seu atributo `unidadeDeMassa` em lb e o segundo em kg, a conversão deve ser de libras para quilos.

Cada método deve:
- retornar uma String com o valor resultante da conversão
- retornar uma String com a unidade final

>> Ou seja, se o resultado da conversão for 20 em quilos, o resultado impresso deverá ser: 20 kg.

Caso os dois objetos `Medidas` passados como argumento possuam as mesmas
unidades para um dos métodos de conversão, a seguinte string deve ser retornada:
- "Não é possível realizar a conversão, pois as duas medidas já estão na
mesma unidade!"

As fórmulas para conversão são:
- Celsius x Fahrenheit: °C = (°F - 32)/1,8
- Fahrenheit x Celsius: °F = °C × 1,8 + 32
- Quilos x Libras: kg = lb/ 2.2046
- Libras x Quilos: lb = kg * 2.2046
- Quilômetros x Milhas: km = mi*1,609
- Milhas x Quilômetros: mi = km/1,609

### 04: Estatistica
Implemente uma classe chamada `Estatistica` que:
- recebe um número inteiro positivo no seu construtor.
- atribuí número inteiro recebido a um atributo chamado `maiorValor`.

Outro método deve retornar a média dos número de zero até `maiorValor`.
Outro método deve retornar a variância de zero até `maiorValor`.

Método main:
- este número deve ser lido do teclado.
- Esta classe deve possuir um método para retornar o somatório de zero até
`maiorValor`

Por fim, deve possuir um método que imprime os valores de zero até `maiorValor` no
formato: <valor do número> é par se o número for par e <valor do número> é impar
se ele for impar. 
>> Exemplo: se o número sendo iterado for 2, deve ser impresso: “2 é par”.

Utilize pelo menos:
- um laço do tipo while, outro do tipo do while
- um laço do tipo for
- contador para implementar os métodos.

### 05: ComparadorDeStrings

Implemente uma classe chamada `ComparadorDeStrings`.

Esta classe deve:
- possuir um método que recebe duas Strings como parâmetros
- verifica se essas duas Strings são uma o reverso da outra.

>> Por exemplo: se as String inseridas são Teste e etseT, o método deve retornar true e false caso contrário.

Método main:
- este número deve ser lido do teclado.
