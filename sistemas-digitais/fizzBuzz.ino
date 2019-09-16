/*
 * FizzBuzz é um jogo popular nos EUA para ensinar divisão a crianças. 
 * Nele, os jogadores contam incrementalmente, substituindo 
 * os números divisíveis por 3 por "Fizz" e os divisíveis por 5 por "Buzz". 
 * Números divisíveis por 3 e 5 ao mesmo tempo devem ser substituídos por "FizzBuzz".
 * Exemplo: 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, ...
 *
 * Implemente a função FizzBuzz conforme definida abaixo. 
 * Função: void fizzBuzz(int start, int end)
 * Input: inteiros (start < end) determinando os números de início e fim da contagem.
 * Output: a partir de start (incluído) até end (excluído) seguindo a mesma lógica do FizzBuzz, separado por linha.
 */
 
void setup() {
  Serial.begin(9600);
}

void loop(){
  if(Serial.available() > 0){
    int start = Serial.parseInt();
    int end = Serial.parseInt();
    fizzBuzz(start, end);
  }
}

void fizzBuzz(int start, int end) {
  for (int counter = start; counter < end; counter++){
    if (counter % 5 == 0 && counter % 3 ==0)
      Serial.println("FizzBuzz");
    else if (counter % 3 == 0)
      Serial.println("Fizz");
    else if (counter % 5 == 0)
      Serial.println("Buzz");
    else
      Serial.println(counter);
    delay(500);
  }
}
