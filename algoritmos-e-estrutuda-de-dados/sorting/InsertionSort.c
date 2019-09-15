// Insetion code by Victor & Leo.
#include <stdio.h>

int InsertionSortAlgorithm(int *, int);

int main(void){
    int length;
    scanf("%d", &length);

    int array[length], index = 0;
    while(scanf("%d", &array[index]) == 1)
        index++;
    
    InsertionSortAlgorithm(array, length);
    for(index = 0; index < length; index++)
        printf("%d ", array[index]);

    return 0;
}

int InsertionSortAlgorithm(int *array, int length){
    for (int i = 1; i < length;i++){
        int chave = array[i];
        int j = i - 1;
        while (j >= 0 && array[j] > chave){
            array[j+1] = array[j];
            j = j-1;
        }
        array[j+1] = chave;
    }
    return 0;
}