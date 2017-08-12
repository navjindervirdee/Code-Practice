#include <iostream>
using namespace std;
int main()
{
    int x=0,sum=0;
    while(true)
    {
        cout <<"Enter any number"<<endl;
        cin >> x;
    if(x==-999)
    {
      cout<<"Sum ="<<sum <<endl;
       return 0;
    }
        sum=sum+x;
        cout<<"Sum ="<<sum <<endl;
        
    }
    return 0;
}


