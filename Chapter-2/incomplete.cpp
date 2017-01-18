#include <iostream>
using namespace std;
float value (float p, int n, float r)
{
    int year =1;
    float sum =p;
    while(year <= n)
    {
        sum =sum*(1+r);
        year++;
    }
    return (sum);
}

int main()
{
    float amount;
    float value(float p, int n, float r=0.15);
    amount =value(5000, 5);
    cout << "final value =" <<amount <<endl;
    return 0;
}


