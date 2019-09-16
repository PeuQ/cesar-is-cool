#include <stdio.h>

int main(void){
    int iterator = 1;
    for(; iterator < 101; iterator++){
        printf("%d ", iterator);
    }
    printf("\n");
    iterator = 1;
    while(iterator < 101){
        printf("%d ", iterator);
        iterator++;
    }
    printf("\n");
    iterator = 1;
    do{
        printf("%d ", iterator);
        iterator++;
    }while(iterator < 101);
    
    return 0;
}