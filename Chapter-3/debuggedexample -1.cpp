/*#include <iostream>
int fun()
{
    return 1;
}
float fun()
{
    return 10.23;

    int main()
    {
        cout <<(int)fun() <<' ';
        cout <<(float)fun() << ' ';
        return 0;
    }
    */
#include <iostream>
using namespace std;
int fun(int)
{
    return 1;
}
float fun(double)
{
    return 10.23;
}
    int main()
    {
        cout <<fun(5) << endl;
        cout << fun(60.9) << endl;
        return 0;
    }
  
  



     