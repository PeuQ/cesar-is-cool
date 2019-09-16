/*
Leia uma matriz 4 x 4, imprima a matriz e retorne a 
localizac¸ao (linha e a coluna) do ˜maior valor.
*/

#include <stdio.h>

int main(void){
    int matrix[4][4] = { 
        1, 2, 3, 4,
        2, 2, 3, 4,
        3, 2, 3, 4,
        4, 2, 3, 10
    };
    int max = 0, line, column;
    for(int i = 0; i < 4; i++){
        for(int j=0; j < 4; j++){
            if (matrix[i][j] > max)
                max = matrix[i][j];
                line = i;
                column = j;
        }
    }
    printf("Max: %d \nItem at Matrix[%d][%d]", max, line, column);

    return 0;
}