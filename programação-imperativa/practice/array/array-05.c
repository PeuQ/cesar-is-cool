/*
Leia um array de 10 posic¸oes. 
Contar e escrever quantos valores pares ele possui. 
*/

#include <stdio.h>

int main(void){
    int counter = 0, array[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for(int index = 0; index < 10; index++){
        if(array[index] % 2 == 0)
            counter++;
    }
    printf("%d" ,counter);
    return 0;
}