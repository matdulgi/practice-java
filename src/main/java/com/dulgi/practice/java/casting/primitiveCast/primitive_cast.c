#include <stdio.h>

// c takes loose typing
int main(void){
    int i = 3;
    float f = 4.0;

    int a = f;
    float b = i;

    printf("%d\n", a);
    printf("%f\n", b);

    double d = 5.11;
    b = d;
    printf("%f\n", d);
    printf("%f\n", b);
}