#include <iostream>
using namespace std;
class complex
{
    float x, y;
    
    public :
     complex()
     {
         x=0;
         y=0;
     }
     complex(float real, float imag)
     {
        
         x=real;
         y=imag;
     }
     complex operator+(complex);
     void display();
};
complex complex :: operator+(complex c)
{
    complex temp, b;
    temp.x = x + c.x + b.x;
    temp.y = y + c.y + b.y;
    return (temp);
}
void complex :: display()
{
    cout << x << " + i" << y <<endl;
}
int main()
{
    complex c1, c2, c3, c4;
    c1 =complex(2.5, 3.5);
    c2 =complex(1.6, 2.7);
    c3 =complex(2.5, 3.5);
    c4= c1 + c2 + c3;
    
    cout << "c1=";
    c1.display();
    cout << "c2=";
    c2.display();
    cout << "c3=";
    c3.display();
    cout << "c4="; c4.display();
    return 0;
}
    