#include <iostream>
using namespace std;
int main()
{
    int x,y,sum=0,remain,a;
    cout << "Enter any two digit number"<<endl;
    cin >> x;
    y=x;
    while(y!=0)
    {
        remain=y%10;
        sum=sum + remain;
        y=y/10;
    }
    a=(3*sum);
    if(x==a)
    {
        cout <<"The number is : "<< x <<endl;
    }
    else
    {
        cout <<"Invalid number"<<endl;
    }
    return 0;
}
     