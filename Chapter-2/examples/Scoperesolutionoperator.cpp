#include <iostream>
using namespace std;
int m = 10;//global m
int main()
{
 int m =20;// m redeclared, local to main
 
 {
   int m = 30;//m declared again, local to inner block
   int k = m;

   cout <<"we are in inner block" <<endl;
   cout << "k = " << k <<endl;
   cout << "m = " << m <<endl;
   cout << "::m = " << ::m <<endl;
 }
 
 cout <<"we are in outer block" <<endl;
 cout << "m = " <<m <<endl;
 cout << "::m = " <<::m <<endl;
}
   