#include <iostream>
using namespace std;
class item
{
   int number; //private by default
   int cost;   //private by dafault
   
  public:
    void getdata(int a, float b); //prototype declaration
                                  //to be defined
    void putdata()
     {
       cout << "Number:" << number <<endl;
       cout << "Cost:" << cost <<endl;
     }
};
//member function definition

void item :: getdata(int a, float b)
{
  number = a;
  cost = b;
}
//Main program starts

int main()
{
  item x, y;
  cout << "Object x:" <<endl;
  
  x.getdata(200, 195.95);
  x.putdata();

  cout << "Object y:" << endl;
  
  y.getdata(400, 210.50);
  y.putdata();

  return 0;
}
  