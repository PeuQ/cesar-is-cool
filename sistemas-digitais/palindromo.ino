/*
 * Escreva uma função que analisa uma dada palavra ou frase, retornando se a mesma é um palíndromo ou não.
 * Função: bool isPalindrome (String sentence)
 * Input: array de caracteres (string) em minúsculo da palavra ou frase a ser analisada.
 * Output: true se a sentença é um palídromo, falso caso negativo.
 * Palíndromos são palavras ou frases que são lidas da mesma forma tanto da esquerda para a direita quanto da direita para a esquerda.
 * Exemplos: ovo, arara, ana, apos a sopa, reviver...
 */

void setup(){
  Serial.begin(9600);
}

void loop(){
  if(Serial.available() > 0){
    String word = Serial.readString();
    Serial.print(word);
    if (isPalindromo(word) == true)
      Serial.println(" E palindromo");
    else
      Serial.println(" NAO e palindromo");
  }
}

bool isPalindromo(String word){
  int size = word.length();
  for (int counter = 0; counter <= size/2; counter++){
    if(word.charAt(counter) != word.charAt(size-1))
      return false;
    size--;
  }
  return true;
}
