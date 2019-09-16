/*
Leia uma matriz 4 x 4, conte e 
escreva quantos valores maiores que 10 ela possui.
*/

#include <stdio.h>

int main(void){
    int matrix[4][4] = { 
        11, 2, 3, 4,
        2, 10, 3, 4,
        3, 2, 10, 4,
        4, 2, 3, 11
    };
    int counter = 0;
    for(int i = 0; i < 4; i++){
        for(int j=0; j < 4; j++){
            if (matrix[i][j] > 10)
                counter++;
        }
    }
    printf("%d", counter);
    
    return 0;
}