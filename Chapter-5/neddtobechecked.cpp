#include <iostream>
using namespace std;
class Fixed_deposit
{
    long int P_amount; //principal amount
    int Years; //period of investment
    float Rate; //interest rate
    float R_value; //Return value of amount
    
    public :
      Fixed_deposit();
      Fixed_deposit(long int p, int y, float r = 0.12);
      Fixed_deposit(long int p, int y, float r);
      void display();
};

Fixed_deposit :: Fixed_deposit(long int p, int y, float r)
{
    P_amount =p;
    Years =y;
    Rate =r;
    
    R_value = P_amount;
    for(int i=1; i<=y; i++)
    R_value  = R_value * (1 + r);
}

Fixed_deposit :: Fixed_deposit(long int p, int y, int r)
{
    P_amount =p;
    Years =y;
    Rate =r;
    R-value =P_amount;
    for(int i=1; i<=y; i++)
    R_value  = R_value * (1 + float(r)/100);
}

void Fixed_deposit :: display()
{
    cout << "Principal Amount  =" << P_amount <<endl;
    cout << "Return Value      =" << R_value <<endl;
}
    
int main()
{
    Fixed_deposit FD1, FD2, FD3;
    long int p;
    int y;
    float r;
    int R;
        
    cout <<"Enter amount, period, interest rate(in  percent)" <<endl;
    cin >>p >> y >> R;
    FD1 = Fixed_deposit(p, y, r);
        
    cout <<"Enter amount, period, interest rate(decimal form)" <<endl;
    cin >> p >> y >> r;
    FD2 = Fixed_deposit(p, y, r);
        
    cout << "Enter amount and period" <<endl;
    cin >> p >> y;
    FD3 =Fixed_deposit(p, y);
         
    cout << "Deposit 1";
    FD1.display();
        
    cout << "Deposit 2" <<endl;
    FD2.display();
        
    cout << "Deposit 3" <<endl;
    FD3.display();
        
    return 0;
}
    