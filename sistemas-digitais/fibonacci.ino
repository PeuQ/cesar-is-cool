/*
 * A Sequência de Fibonacci é uma sequência de números inteiros, começando por 0 e 1, na
 * qual, cada termo subsequente corresponde à soma dos dois anteriores.
 * Defina uma função que recebe um número N e imprime pela serial os N primeiros números
 * na sequência de Fibonacci.
 * Seu programa deve receber a entrada pela Serial no loop e chamar a função definida.
 * Exemplos:
 * fibonacci(3); -> 0, 1, 1
 * fibonacci(6); -> 0, 1, 1, 2, 3, 5
 * fibonacci(9); -> 0, 1, 1, 2, 3, 5, 8, 13, 21
 */

void setup(){
    Serial.begin(9600);
}

void loop(){
  if(Serial.available() > 0){
    int input = Serial.parseInt();
    for(int counter = 0; counter < input; counter++){
      Serial.print(fibonacci(counter));
      Serial.print(" ");
    }
  }
}

int fibonacci(int input){	
  if(input == 0) 
    return 0; 
  else if(input == 1)
    return 1;
  else
    return (fibonacci(input-1) + fibonacci(input-2));
}
