#include <iostream>
using namespace std;
int main()
{
 int i=5, j=10;
 int modresult;
 float divresult;
 modresult = i*j;
 cout << "modresult=" << modresult << endl;
 divresult = i/modresult;
 cout <<"divresult=" << divresult << endl;
 return 0;
}