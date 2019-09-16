/*
1. Fac¸a um programa que possua um array denominado A que armazene 6 numeros intei- ´
ros. O programa deve executar os seguintes passos:
(a) Atribua os seguintes valores a esse array: 1, 0, 5, -2, -5, 7.
(b) Armazene em uma variavel inteira (simples) a sum entre os valores das posic¸ ´ oes ˜
A[0], A[1] e A[5] do array e mostre na tela esta sum.
(c) Modifique o array na posic¸ao 4, atribuindo a esta posic¸ ˜ ao o valor 100. ˜
(d) Mostre na tela cada valor do array A, um em cada linha.
*/

#include <stdio.h>

int main(void){
    int array[6] = {1, 0, 5, -2, -5, 7};
    int sum = array[0] + array[1] + array[5];
    printf("\nSoma: %d", sum);

    for(int index = 0; index < 6; index++){
        if(index == 4)
            array[4] = 100;
        printf("%d ", array[index]);
    }

    return 0;
}
