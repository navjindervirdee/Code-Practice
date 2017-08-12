#include <stdio.h>
void swap(int &x, int &y)
    {
       int z=x;
        x=y;
        y=z;
    }
int main()
{
    int x, y;
    printf("Enter two numbers\n");
    scanf("%d %d",&x,&y);
    swap(x, y);
    printf("After swapping,\nx=%d\ny=%d",x,y);
    return 0;
}