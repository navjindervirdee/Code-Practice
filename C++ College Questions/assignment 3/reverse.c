#include <iostream>
using namespace std;
int main()
{
    int x,y,reverse=0;
    cout <<"Enter number to be reversed"<<endl;
    cin >>x;
    y=x;
    while(y!=0)
    {
        reverse= (reverse*10);
        reverse= reverse + (y%10);
        y=y/10;
    }
    cout <<"Reverse of number : "<< reverse <<endl;
    return 0;
}
