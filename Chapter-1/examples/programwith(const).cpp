#include <iostream>
using namespace std;
const float i(0.556);
int main()
{
  int c, f ;
  cout << "Enter temperature in f"<<endl;
  cin >> f;
  c=(f-32)*i;
  cout << "temp in c" << c << endl;
  return 0;
}
 
