#include <iostream>
using namespace std;
const double i(3.147);
int volume(int a) //cube
{
    return(a*a*a);
}
float volume(float x, int y, float z) //rectangular box
{
    return(x*y*z);
}
double volume(double a, int b) //cylinder
{
    return (i*a*a*b);
}
int main()
{
    cout << volume(10) <<endl;
    cout << volume(2.5, 10)<<endl;
    cout << volume(6.25, 100)<<endl;
    return 0;
}