#include <stdio.h>
int main()
{
    printf("Enter any integer\n");
    int x;
    scanf("%d",&x);
    if(x%5==0 || x%8==0)
    {
       printf("Number is divisible by 5 or 8\n");
    }
    else
    {
        printf("Number is not divisble by 5 or 8");
    }
    return 0;
}
    
        
