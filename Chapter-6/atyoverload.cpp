#include <iostream>
#include <math.h>
using namespace std;
class Polar
{
    float x, y, r1, r2, a1, a2, x1, x2, y1, y2, R, A, An;
    
    public :
    void getdata()
    {
        cout << "Enter radius of two points :" <<endl;
        cin >> r1 >> r2;
        cout << "Enter angles of two points :" <<endl;
        cin >> a1 >> a2;
    }
    void converter()
    {
        x1=r1*cos(a1);
        x2=r2*cos(a2);
        y1=r1*sin(a1);
        y2=r2*sin(a2);
    }
    void result()
    {
        x=x1+x2;
        y=y1+y2;
        R= sqrt(x*x + y*y);
        
        A=atan(y/x);
    }
    void putdata()
    {
       cout << "Radius of new point becomes :" << R <<endl;
       cout << "Angle of new point becomes  :" << A <<endl;
       cout << "Thank you." <<endl;
    }
};
int main()
{
    Polar P;
    cout <<"Welcome to world of maths." <<endl;
    cout <<"Let's start."<<endl;
    P.getdata();
    P.converter();
    P.result();
    P.putdata();
    return 0;
}
    
        
        