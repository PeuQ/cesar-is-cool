/*
Entre com um nome e imprima o nome somente se a primeira 
letra do nome for ‘a’ (maiuscula ou min ´ uscula). 
*/

#include <stdio.h>

int main(void){
    char string[256];
    scanf("%s", string);
    if(string[0] == 'a' || string[0] == 'A')
        printf("%s", string);

    return 0;
}