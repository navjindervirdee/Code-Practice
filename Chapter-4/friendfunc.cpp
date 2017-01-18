#include <iostream>
using namespace std;
class sample
{
    int a, b, x, y;
    
    
    public :
     void setval()
     {
         cout <<"Enter numbers a and b :" <<endl;
         cin >> x;
         cin >> y;
         
         a=x;
         b=y;   
     }
     friend float mean(sample s);
};

float mean(sample s)
{
    return float(s.a + s.b)/2 ;
}

int main()
{
    sample X;
    X.setval();
    cout << "Mean value = " <<mean(X) << endl;
    return 0;
}