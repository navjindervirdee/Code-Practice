#include <stdio.h>
int main()
{
    float p, r, t, i;
    printf("Enter principal value, rate of interest(not in percentage), number of years\n");
    scanf("%f %f %f",&p, &r, &t);
    i=p*r*t;
    printf("Simple Interest = %f",i);
    return 0;
}