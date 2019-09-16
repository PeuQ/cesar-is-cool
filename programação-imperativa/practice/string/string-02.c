/*
Crie um programa que calcula o comprimento 
de uma string (nao use a func¸ ˜ ao strlen). 
*/

#include <stdio.h>

int main(void){
    int input, counter = 0;
    while ((input = getchar()) != EOF){
        counter++;
    }
    printf("%d", counter);  
}