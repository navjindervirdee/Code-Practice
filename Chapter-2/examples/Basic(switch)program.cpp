#include <iostream>
using namespace std;
int main ()
{
  char alphabet;
  char a, b, c;
  cout <<"enter alphabet a or b or c"<<endl;
  cin >> alphabet;
  switch(alphabet)
  {
      case 'a' :
      cout <<"10"<<endl;
      break;
      case 'b':
      cout <<"20"<<endl;
      break;
      case 'c':
      cout <<"30"<<endl;
      break;
      default:
      cout <<"wrong"<<endl;
  }
  return 0;
}