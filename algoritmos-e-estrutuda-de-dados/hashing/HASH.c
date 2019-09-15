#include <stdio.h>

int main(void){
    unsigned int t;
    scanf("%u", &t);

    while (t--){
        unsigned long long a, b, x, n, c, d, m, counter = 0;
        scanf("%llu %llu %llu %llu %llu %llu %llu", &a, &b, &x, &n, &c, &d, &m);     
        for (unsigned long long index = 0; index <= n; index++){
            unsigned long long hx = (a * (x + index) + b) % m;
            if ((c <= hx) && (hx <= d) && (hx <= (m - 1))){
                counter++;
                };
        };
        printf("%llu\n", counter);
        counter = 0;
    };
    return 0;
}
