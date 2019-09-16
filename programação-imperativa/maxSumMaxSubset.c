#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define BUFFER_SIZE 2048
#define MAX_LEN 256

int maxSum(int *, int);

int main(void){
    FILE *fp = fopen("./input.txt", "r");
    if (!fp){
        perror("Error");
        return 1;
    }

    char *lineContent = (char *)malloc(BUFFER_SIZE * sizeof(char *));
    while(fgets(lineContent, BUFFER_SIZE, fp) != NULL){
        char *contentElements = strtok(lineContent,"[ ,]\n");
        int array[MAX_LEN], length = 0;
        for (int index = 0; contentElements != NULL; index++){
            int element = atoi(contentElements);
            array[index] = element;
            contentElements = strtok(NULL, "[ ,]\n");
            length++;
        }
        
        printf("\nFull Set: \t [");
        for(int index = 0; index < length; index++)
            printf(" %d", array[index]);
        printf(" ]");

        printf("\nMaximum Sum: %d\n", maxSum(array, length));
    }

    free(lineContent);
    fclose(fp);
    return 0;
}

int maxSum(int *array, int arrayLength){
    int currentSum = 0, maxSum = 0, counter = 0, start, end;
    for (int index = 0; index < arrayLength; index++){
        currentSum += array[index];
        counter++;

        if (currentSum < 0){
            currentSum = 0;
            counter = 0;
        }
        if(currentSum > maxSum){
            maxSum = currentSum;
            start = counter;
            end = index;
        }
        else if (currentSum == maxSum && counter > start){
            start = counter;
            end = index;
        }
    }

    printf("\nSmallest Subset: [");
    for (int index = (end - start) +1; index <= end; index++)
        printf(" %d", array[index]);
    printf(" ]");

    return maxSum;
}