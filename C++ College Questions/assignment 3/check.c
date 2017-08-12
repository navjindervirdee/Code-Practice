#include <stdio.h>

int main()
{
    char x;
    printf("Enter anything\n");
    scanf("%c",&x);
    if(x>='A' && x<='Z')
    {
        printf("You have entered Upper case letter\n");
    }
    else
    
    if(x>='a' && x<='z')
    {
        printf("You have entered lower case letter\n");
    }
    else
    
    if(x>='0' && x<='9')
    {
        printf("You have entered a digit\n");
    }
    else
    {
       printf("You have entered a special character\n");
    }
    return 0;
}