#include <iostream>
using namespace std;
int factorial(int n)
{
    int sum=1;
    for(int i=n; i>=1; i--)
    {
        sum=sum*i;
    }
    return (sum);
}
int main()
{
    int x;
    float sum=0;
    cout <<"Enter the last digit to be factorialised"<<endl;
    cin >> x;
    
    for(int j=1; j<=x; j++)
    {
        sum=sum + 1.0/factorial(j);
    }
    cout <<"e = "<< sum <<endl;
    return 0;
}