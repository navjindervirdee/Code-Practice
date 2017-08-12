#include <stdio.h>
int main()
{
    printf("Enter any integer\n");
    int x,y,sum=0,remain;
    scanf("%d",&x);
    y=x;
    while(y!=0)
    {
        remain = y%10;
        sum=sum+remain;
        y=y/10;
    }
    printf("Sum = %d\n",sum);
    return 0;
}
    
