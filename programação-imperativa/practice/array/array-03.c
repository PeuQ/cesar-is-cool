/*
Ler um conjunto de numeros reais, armazenando-o em vetor 
e calcular o quadrado das ´ componentes deste vetor, armazenando 
o resultado em outro vetor. Os conjuntos temˆ 
10 elementos cada. Imprimir todos os conjuntos.
*/

#include <stdio.h>

int main(void){
    int array[10], squared[10];
    for(int index = 0; index < 10; index++){
        scanf("%d", &array[index]);
        printf("%d ", array[index]);
    }
    printf("\n");
    for(int index = 0; index < 10; index++){
        squared[index] = array[index] * array[index];
        printf("%d ", squared[index]);
    }

    return 0;
}