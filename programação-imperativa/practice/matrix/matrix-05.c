/*

*/

#include <stdio.h>

int main(void){
    int matrix[5][5] = { 
        1, 2, 3, 4, 5,
        2, 2, 3, 4, 5,
        3, 2, 3, 4, 5,
        4, 2, 3, 4, 5,
        5, 2, 3, 4, 10
    };
    int X, itemFound = 0;
    scanf("%d", &X);
    for(int i = 0; i < 5; i++){
        for(int j=0; j < 5; j++){
            if(matrix[i][j] == X){
                printf("Item at: Matrix[%d][%d]", i, j);
                itemFound = 1;
                break;
            }
        }
    }
    if(!itemFound)
        printf("Item not found");

    return 0;
}