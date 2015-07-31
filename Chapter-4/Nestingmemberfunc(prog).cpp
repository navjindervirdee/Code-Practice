#include <iostream>
using namespace std;
class set
{
  int m, n;
  
 public:
   void input();
   void display();
   int largest();
};

int set :: largest()
 {
  if(m >= n)
    return(m);
   
  else
    return(n); 
 }
void set :: input()
 {
   cout << "Enter values of m and n:" <<endl;
   cin >> m;
   cin >> n;
 }
void set :: display()
 {
  cout << "Largest number=" << largest() <<endl;
 }

int main()
{
  set A, B;
  A.input();
  A.display();
  
  B.input();
  B.display();
  return 0;
}

  

 