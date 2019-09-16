/*
Fac¸a um programa que preenche uma matriz 4 x 4 com o 
produto do valor da linha e da
coluna de cada elemento. Em seguida, imprima na tela a matriz.
*/

#include <stdio.h>

int main(void){
    int matrix[4][4];
    for(int i = 0; i < 4; i++){
        for(int j=0; j < 4; j++){
            matrix[i][j] = i*j;
        }
    }
    for(int i = 0; i < 4; i++){
        printf("\n[");
        for(int j=0; j < 4; j++){
            printf(" %d ", matrix[i][j]);
        }
        printf("]");
    }
 
    return 0;
}