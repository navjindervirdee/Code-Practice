#include <stdio.h>
#include <math.h>
int main()
{
    float p, r, t, c, n, x, y;
    printf("Enter principal value, rate of interest(not in percentage),number of times per year interest, number of years\n");
    scanf("%f %f %f %f",&p, &r, &n, &t);
    x=(1+(r/n));
    y=pow(x,(n*t));
    c=p*y;
    printf("Compound Interest = %f",c);
    return 0;
}