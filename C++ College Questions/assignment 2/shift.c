#include <stdio.h>
int main()
{
    int a=20, b=60;
    printf("Before shift\na=20\nb=60");
    printf("\nAfter shift\na is shifted left by 1 bit\t %d\t\n",a<<1);
    printf("b is shifted right by 1 bit\t %d",b>>1);
    return 0;
}
    