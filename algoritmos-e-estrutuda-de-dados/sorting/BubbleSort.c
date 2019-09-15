// BubbleSort Code, by Victor & Leo
#include <stdio.h>

int BubbleSortAlgorithm(int *, int);
void xorSwap(int *, int *);
void swap(int *, int *);

int main(void){
    int length;
    scanf("%d", &length);

    int array[length], index = 0;
    while(scanf("%d", &array[index]) == 1)
        index++;
    
    BubbleSortAlgorithm(array, length);
    for(index = 0; index < length; index++)
        printf("%d ", array[index]);

    return 0;
}

int BubbleSortAlgorithm(int *array, int length){
    for(int i = 0; i < length -1; i++){
        for(int j = 0; j < length-i-1;j++){
            if (array[j] > array[j+1])
                swap(&array[j],&array[j+1]);
                // xorSwap(&array[j], &array[j+1]);
        }
    }
    return 0;
}

/*** XOR Swap Function: uses the XOR bitwise operation to swap values ***/
void xorSwap(int *min, int *iterator){
    if (min == iterator)                                         /* Equal adressess lead to `*x = *x ^ *x` x3, which is 0            */
        return;

    *min      = *min ^ *iterator;                                /* Combining xy ->  x = x ^ y                                       */
    *iterator = *min ^ *iterator;                                /* Canceling  y ->  (x ^ y) ^ y  ->  x ^ (y ^ y)  ->  x ^ 0  ->  x  */
    *min      = *min ^ *iterator;                                /* Canceling xy ->  (x ^ y) ^ x  ->  y ^ (x ^ x)  ->  y ^ 0  ->  y  */
}

/*** Swap Function: uses call-by-reference to swap values ***/
void swap(int *min, int *iterator){
    int temp  = *min;                                            /* Saving `min` value in `temp`                                     */
    *min      = *iterator;                                       /* Setting `min` value to `iterator` value                          */
    *iterator = temp;                                            /* Setting `iterato` value to `temp` value (old `min`)              */
}