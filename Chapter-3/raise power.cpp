#include <iostream>
#include <math.h>
using namespace std;
int main()
{
    float m;
    int n;
    int  x;
    cout <<"enter value of m :" <<endl;
    cin >> m;
    cout <<"enter value of n"<<endl;
    cin >> n;

    switch(n)
    {
        case 1  : x = pow(m ,n);
        break;
        default :x= pow(m, 2);
    
        
    }
    cout << "value :"<< x << endl;
    return 0;
}
    
    