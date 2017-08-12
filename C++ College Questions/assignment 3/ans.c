#include <iostream>
#include <math.h>
using namespace std;
int main()
{
    float x=13312, left,z;
    for(int i=1; i<=10; i++)
    {
        z=pow(2,i);
        left=x/z;
    }
    cout<<"Bacteria on first day was : "<<left <<endl;
    return 0;
}
        