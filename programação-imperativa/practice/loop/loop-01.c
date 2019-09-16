#include <stdio.h>

int main(void){
    int multiplier = 1;
    for(int counter = 0; counter < 5; multiplier++){
        if(multiplier % 3 == 0){
            printf("%d ", multiplier);
            counter++;
        }
    }
    return 0;
}