#include <iostream>
using namespace std;
int main()
{
  int a, b, c, x;
  cout << "Enter a" <<endl;
  cin >> a;
  cout << "Enter b" <<endl;
  cin >> b;
  cout <<"Enter c" <<endl;
  cin >> c;
  x = a/(b-c);
  cout << "x=" << x <<endl;
  return 0;
}
