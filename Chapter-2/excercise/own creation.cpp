#include <iostream>
using namespace std;
int main()
{
    cout << "Hi" <<endl;
    char  Hi, colour;
    cin >> Hi;
    cout << "Do you want to buy shirts?."<<endl;
    cout << "Yes which colour you want"<<endl
         <<"We have blue, green and red."<<endl;
    cin >> colour;
    char b, r, g;
    switch(colour)
    {
     case 'b': 
          cout <<"Price of blue = rs 2000"<<endl;
     break;
     case 'r' :
          cout <<"Price of red shirt = rs 2500"<<endl;
     break;
     case 'g' : 
          cout <<"Price of green shirt = rs 3000"<<endl;
     break;
    
     default :
          cout << "Sorry not available"<<endl;
    }
    cout <<"Do you want to buy it?If yes, then enter number greater than 1."<<endl;
    int i;
    cin >> i;
    if (i > 1) cout << "Thank you for shopping"<<endl;
    
    else cout <<"Go to hell"<<endl;
    return 0;
}
    
    
             