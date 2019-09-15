#include <stdio.h>

int HeapSortAlgorithm(int *, int);
void Heapify(int *, int, int);
void xorSwap(int *, int *);
void swap(int *, int *);


int main(void){
    int length;
    scanf("%d", &length);

    int array[length], index = 0;
    while(scanf("%d", &array[index]) == 1)
        index++;
    
    HeapSortAlgorithm(array, length);
    for(index = 0; index < length; index++)
        printf("%d ", array[index]);

    return 0;
}

int HeapSortAlgorithm(int *array, int length){
	for (int i = length / 2 - 1; i >= 0; i--)
		Heapify(array, length, i);

	for (int i = length - 1; i >= 0; i--){
		swap(&array[0], &array[i]);
		Heapify(array, i, 0);
	}
	return 0;
}

void Heapify(int *array, int length, int root){
	int largest = root;  
	int left = 2 * root + 1; 
	int right = 2 * root + 2;

	if (left < length && array[left] > array[largest])
		largest = left;
	if (right < length && array[right] > array[largest])
		largest = right;

	if (largest != root){
        // swap(&array[root], &array[largest]);
		xorSwap(&array[root], &array[largest]);
		Heapify(array, length, largest);
	}
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
