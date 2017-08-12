#include <stdio.h>
int main()
{
    printf("Enter number of days delayed\n");
    int x;
    scanf("%d",&x);
    if(x>0 && x<=5)
    {
        printf("You have to pay a fine of 50 paise\n");
    }
    else
    {
        if(x>5 && x<=10)
        {
            printf("You have to pay fine of 1 rupee\n");
        }
        else
        {
            if(x>10 && x<=30)
            {
                printf("You have to pay a fine of 5 rupees\n");
            }
            else 
            {
                if(x>30)
                {
                    printf("Your membership has been cancelled");
                }
                else
                {
                   printf("Invalid number");
                }
            }
        }
    }
    return 0;
}