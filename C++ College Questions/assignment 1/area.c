#include <stdio.h>
const float pi=3.14;
int main()
{
    float r, a;
    printf("Enter the radius of cirlce\n");
    scanf("%f",&r);
    a=pi*r*r;
    printf("Area = %f",a);
    return 0;
}