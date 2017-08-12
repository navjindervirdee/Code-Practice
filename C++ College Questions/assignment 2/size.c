#include <stdio.h>
int main()
{
    int a;
    float b;
    char c;
    double d;
    long int e;
    printf("Size of integer \t%d bytes \n", sizeof(a));
    printf("Size of float   \t%d bytes \n", sizeof(b));
    printf("Size of Character  \t%d bytes \n", sizeof(c));
    printf("Size of double  \t%d bytes \n", sizeof(d));
    printf("Size of long int  \t%d bytes \n", sizeof(e));
    return 0;
}