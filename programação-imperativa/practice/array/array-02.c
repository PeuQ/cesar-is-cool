/*
Crie um programa que le 
6 valores inteiros e, em seguida, 
mostre na tela os valores lidos
*/

#include <stdio.h>

int main(void){
    int key, index = 0, array[6];
    while(scanf("%d", &array[index]) == 1){
        printf("%d ", array[index]);
        index++;
    }
    return 0;
}