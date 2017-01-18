#include <iostream>
using namespace std;
class Space
{
    int x, y, z;
    public :
     void getdata(int a, int b, int c)
     {
       x=a;
       y=b;
       z=c;
     }
     void display()
     {
         cout << x <<" " 
              << y <<" "
              <<  z <<" "<<endl;
     }
     void operator-();
};
void Space :: operator-()
{
    x=-x;
    y=-y;
    z=-z;
}
int main()
{
    Space S;
    S.getdata(100, -200, 300);
    cout << "S ="; S.display();
    -S;
    cout <<"-S =" ; S.display();
    return 0;
}