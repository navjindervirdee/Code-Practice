#include <iostream>
using namespace std;
inline int mul(float x, float y)
{
    return (x*y);
}
inline double divi(double x, double y)
{
    return (x/y);
}
int main()
{
    int a, b;
    cout << "enter two number a and b" <<endl;
    cin >> a;
    cin >> b;
    cout << mul(a,b) <<endl;
    cout << divi(a,b) <<endl;
    return 0;
}
         