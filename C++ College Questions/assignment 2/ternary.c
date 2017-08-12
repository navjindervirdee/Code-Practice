#include <stdio.h>
int main()
{
    int x, y;
    printf("Enter two integers\n");
    scanf("%d %d",&x, &y);
    printf("Max value=%d\n",((x>y) ? x : y));
    printf("Min value=%d\n",((x<y) ? x : y));
    return 0;
}
