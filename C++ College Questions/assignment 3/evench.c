#include <stdio.h>
int main()
{
    printf("Enter any integer\n");
    int x;
    scanf("%d",&x);
    if(x>0)
    {
       printf("You have entered positive interger\n");
       if(x%2==0)
    {
        printf("Number is even\n");
    }
    else
    {       
      if(x%2!=0)
        {
            printf("Number is odd\n");
        }            
    }  
    }
    else
    {
      printf("You have entered negative interger\n");   
    }
    return 0;
}

            
    