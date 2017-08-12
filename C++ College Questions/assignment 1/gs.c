#include <stdio.h>
int main()
{
    float gs, bs, da, ta;
    printf("Enter basic salary\n");
    scanf("%f",&bs);
    da=(0.1*bs);
    ta=(0.12*bs);
    gs=bs + da + ta;
    printf("Gross salary = %f",gs);
    return 0;
}
