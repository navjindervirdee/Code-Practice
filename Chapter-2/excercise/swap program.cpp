#include <iostream>
using namespace std;
void swap(int& q, int& w)
{
    int p = q;
    q =w;
    w=p;
}
int main()
{
    int a, b;
    cout << "Enter numbers a and b:" << endl;
    cin >> a;
    cin >> b;
    int & x = a;
    int & y = b;
    cout << "Before a =" << a << "," << " Before b =" << b <<endl;
    swap(x,y);
    cout << "After a becomes x and x =" << x << "," << " After b becomes y and y =" << y <<endl;
    cout << "Bye" << endl;
    return 0;
}
    
    