#include <stdio.h>
#include <math.h>
int main()
{
    float x, y, z;
    printf("Enter number and power to which it should be raised\n");
    scanf("%f %f",&x, &y);
    z=pow(x,(1/y));
    printf("Number becomes = %f\n",z);
    return 0;
}
