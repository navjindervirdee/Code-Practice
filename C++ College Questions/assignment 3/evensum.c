#include <iostream>
using namespace std;
int main()
{
    int x,sum=0;
    while(1)
    {
        cout <<"Enter any number :"<<endl;
        cin >> x;
        if(x== -100)
        {
            cout << "Invalid number" <<endl;
            return 0;
        }
        else
        {
            if(x%2==0)
            {
                sum=sum + x;
                cout <<"Sum of positive integers : "<< sum <<endl;
            }
            else
            {
                continue;
            }
        }
    }
    return 0;
}