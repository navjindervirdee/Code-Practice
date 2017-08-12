#include <stdio.h>
int main()
{
    int num[20],i,j;
    for(i=1; i<=20 ;i++)
    {
        printf("Number %d\n",i);
        scanf("%d",&num[i]);
    }
    for(j=1; j<=20; j++)
    {
        if(num[j]%2==0)
        {
            printf("Even number at: %d is %d\n",j,num[j]);
        }
    }
    printf("exiting");
    return 0;
}
           