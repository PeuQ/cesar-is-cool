/*
fac¸a um programa que leia um nome e 
imprima as 4 primeiras letras do nome.
*/

#include <stdio.h>

int main(void){
    char string[10];
    scanf("%s", string);
    printf("%.*s", 4, string);

    return 0;
}