#include <iostream>
using namespace std;
class items
{
    static int count;
    int number;
    
    public:
     void getdata(int a)
     {
         number = a;
         count ++;
     }
     void getcount()
     {
         cout <<"count :" << count <<endl;
     }
};
int items ::count = 10;

int main()
{
    items a, b;
    a.getcount();
    b.getcount();
  
    
    a.getdata(100);
    b.getdata(200);

    
    cout <<"After reading this count becomes:" <<endl;
    
    a.getcount();
    b.getcount();
    
    return 0;
}

    