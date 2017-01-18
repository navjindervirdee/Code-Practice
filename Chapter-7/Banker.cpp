#include <iostream>
#include <math.h>
using namespace std;
const int i=10000;
const float y=0.005;

int h, x;
class account
{
    protected :
    char cn[10];
    int an, x;
    
    
    public :
    void get_data()
    {
        cout <<"Enter name :"<< endl;
        cin >> cn;
        cout <<"Enter account number :" <<endl;
        cin >> an;
        cout <<"Mention type(saving account=1, current account =2) :" <<endl;
        cin >> x;
       
    }
    void put_data()
    {
        cout <<"Name :"<< cn <<endl
             <<"Account Number :" << an <<endl;
             
        if(x==1)
        cout <<"Account type : Saving account."<<endl;
        if(x==2)
        cout <<"Account type : Current account."<<endl;
        cout <<"Balance :"<< i <<endl;
    }
};
class sav_acct : public virtual account
{
    protected :
    float A, P, t, w, y, b, u;
    
    public :
    void w_d()
    {
        
        cout <<"Enter amount you want to withdraw :"<<endl;
        cin >> w;
        h=i-w;
        cout <<"Your balance becomes :"<<h<<endl;
    }
    void comp_int()
    {
        
        get_data();
        cout <<"Principal Amount :"<< i <<endl;
        cout <<"Interest rate is fixed.(1%)"<<endl;
        cout <<"\nPlease enter number of years :"<<endl;
        cin >> t;
        cout <<"Interest can be compounded only twice a year."<<endl;
        y=2*t;
        b=0.005;
        u=pow(b,y);
        A=i*u;
        cout <<"Compound interest becomes :"<< A <<endl;
        cout <<"Thank you."<<endl;
    }
};
class cur_acct : public virtual account, public sav_acct
{
    protected :
    float c;
    
    public :
    
    void deposit()
    {
        
        cout <<"Enter amount to be deposited :"<<endl;
        cin >> c;
        cout <<"Balance becomes :"<<i+c <<endl;
    }
    void checker()
    {
        cout << "Welcome to our new facility IB(i.e information bulletin)."<<endl;
        cout << "We have two types of accounts.\n1. Savings account.\n2. Current account."<<endl;
        cout << "Saving account :\nThis account provides you the facilities of compound interest and withrawal facility but no cheque book."<<endl;
        cout << "Current account :\nThis account provide you the facilities of cheque book, deposit facility etc.\n(Note : You should maintain a minimum balance of rs10000, otherwise penalty will be imposed.)"<<endl;
    }
   
    void penalty()
    {
           
        cout <<"Your balance becomes less than minimum value."<<endl;
        cout <<"Please  make sure your balance becomes rs5000 within 3 days or you have to pay a penalty of rs2000."<<endl;
        cout <<"Thank you."<<endl;
    }
};
int main()
{
    cur_acct c;
    int f, q;
    do
    {
    cout <<"Welcome to NSV bank."<<endl;
    cout <<"You can do the following."<<endl;
    cout <<"1. Check your account."<<endl
         <<"2. Deposit money."<<endl
         <<"3. Withdraw money."<<endl
         <<"4. Know conditions of bank."<<endl
         <<"5. Calculate compound interest."<<endl
         <<"6. Exit."<<endl;
    cin >> f;
   
   
    switch(f)
    {
        case 1 : 
            cout <<"Personal information."<<endl;
            c.get_data();
            c.put_data();
        break ;
        
        case 2 : c.get_data();
                 cout <<"Please reconfirm your account type.(saving=1, current=2)."<<endl;
                 cin >> q;
                 if(q==1)
                 {
                     c.deposit();
                 }
                 else 
                 {
                     cout <<"Sorry! You can't deposit money.Please read conditions of bank."<<endl;
                 }
        break;
        
        case 3 : c.get_data();
                 cout <<"Please reconfirm your account type.(saving=1, current=2)."<<endl;
                 cin >> q;
        if(q==2)
         { c.w_d();
           if (h<5000)
           c.penalty();
         }
         else 
         {
             cout <<"Sorry! You can't deposit money.Please read conditions of bank."<<endl;
         }
   
        break ;
        
        case 4 : c.checker();
        break ;
        
        case 5 : c.comp_int();
        break ;
        case 6 : cout <<"Thank you."<<endl;
        break;
        
        default : cout <<"Invalid term."<<endl;
        break;
    }
   }
    while(f!=6);
    
    cout <<"Bye."<<endl;
    return 0;
}
   
         
       
   
      
         
         
       
       
         