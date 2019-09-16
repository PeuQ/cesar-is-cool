/*
Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal 
e com 0 os demais elementos. Escreva ao final a matriz obtida
*/

#include <stdio.h>

int main(void){
    int matrix[5][5] = { 
        1, 2, 3, 4, 5,
        2, 2, 3, 4, 5,
        3, 2, 3, 4, 5,
        4, 2, 3, 4, 5,
        5, 2, 3, 4, 5
    };
    for(int i = 0; i < 5; i++){
        for(int j=0; j < 5; j++){
            if(i == j)
                matrix[i][j] = 0;
            else
                matrix[i][j] = 1;
        }
    }
    for(int i = 0; i < 5; i++){
        printf("\n[");
        for(int j=0; j < 5; j++){
            printf(" %d ", matrix[i][j]);
        }
        printf("]");
    }
    
    return 0;
}