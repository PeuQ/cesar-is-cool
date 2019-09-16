/*
. Fac¸a um programa que leia um array de 8 posic¸oes 
e, em seguida, leia tamb ˜ em dois va- ´
lores X e Y quaisquer correspondentes a duas posic¸oes 
no array. Ao final seu programa ˜
devera escrever a soma dos valores encontrados 
nas respectivas posic¸ ´ oes ˜ X e Y .
*/

#include <stdio.h>

int main(void){
    int X, Y, array[8];
    for(int index = 0; index < 8; index++){
        scanf("%d", &array[index]);
    }
    scanf("%d %d", &X, &Y);
    printf("X: %d \nY: %d \nSoma: %d", array[X], array[Y], array[X] + array[Y]);

    return 0;
}