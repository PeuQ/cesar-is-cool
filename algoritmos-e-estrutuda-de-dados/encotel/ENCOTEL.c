#include <stdio.h>

int main(void){
    char input;
    while (scanf("%c", &input) != EOF){
        // @ASCII Table: 'A' = 65;
        int var = input - 65;
        
        /* @ASCII Table: '-' , '0' and '1' are < 65
        Therefore: 65 - [ascii equivalent of either one above] < 0; 
        This being said, if var < 0: print the input itself ('-', '0' or '1'
        Every other statement will `putchar` the number equivalent to its grouping. */
        if (var < 0)
            putchar(input);
        else if (var > 21)
            putchar('9');
        else if (var > 18)
            putchar('8');
        else if (var > 14)
            putchar('7');
        else if (var > 11)
            putchar('6');
        else if (var > 8)
            putchar('5');
        else if (var > 5)
            putchar('4');
        else if (var > 2)
            putchar('3');
        else
            putchar('2');
    }
    return 0;
}
