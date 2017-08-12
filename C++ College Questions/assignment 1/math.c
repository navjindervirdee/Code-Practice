#include <stdio.h>
int main()
{
    float x, y;
    printf("Enter two numbers\n");
    scanf("%f %f",&x, &y);
    printf("Add = %f\nSub = %f\nMul = %f\nDiv = %f",(x+y), (x-y),(x*y),(x/y));
    return 0;
}
