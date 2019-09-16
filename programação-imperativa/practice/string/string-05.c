/*
Digite um nome, calcule e retorne quantas letras tem esse nome.
*/

#include <stdio.h>

int main(void){
    int input, counter = 0;
    while((input = getchar()) != EOF){
        if((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z'))
            counter++;
    }
    printf("%d", counter);

    return 0;
}