#include <iostream>
#include <math.h>
using namespace std;
int main()
{
  int V, P, n;
  
  float r;
  cout <<"Enter Principal amount (p) =" <<endl;
  cin >> P;
  cout << "Enter number of years (n) =" <<endl;
  cin >> n;
  cout << "Enter r =" << endl;
  cin >> r;
  V = P*(1 + r);
  P=V;
  cout << "Value of money at the end of n years V =" << V << endl;
  cout << "Bye" << endl;
} 
