#include <stdio.h>

int main()
{
    printf("Enter 3 number\n");
    int x, y,z;
    scanf("%d %d %d",&x,&y, &z);
    if(x>y && x>z)
    {
        printf("Largest number = %d\n",x);
    }
    else
    {
    
     if(y>x && y>z)
     {
        printf("Largest number = %d\n",y);
     }
     else
     {
      if(z>x && z>y)
      { 
        printf("Largest value = %d",z);
      }
     }
    }
     return 0;
}