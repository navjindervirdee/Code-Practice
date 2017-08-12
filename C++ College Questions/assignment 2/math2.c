#include <stdio.h>
int main()
{
    int x, y;
    printf("Enter two integers\n");
    scanf("%d %d", &x, &y);
    printf("\tAdd=%d\n\tSub=%d\n\tMul=%d\n\tDiv=%d\n\tMod=%d\n",(x+y), (x-y), (x*y), x/y, (x%y));
    return 0;
}