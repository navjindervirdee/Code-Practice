#include <iostream>
using namespace std;
class BankAccount
{   
    char name[20];
    int accnum;
    int type;
    int balance;
    
    public :
     void getinitial();
     void deposit();
     void withdraw();
     void putdata();
};
int z, y, x, b, a, c;
const int i =1000;


void BankAccount :: getinitial()
{
    cout <<"Enter name:"<<endl;
    cin >> name;
    cout <<"Enter account number: "<<endl;
    cin >> z;
    cout <<"Enter account type.(personal=1/professional=2):" <<endl;
    cin >> y;
    
    cout <<"Name :" << name <<endl;
    cout <<"Account Number :" << z <<endl;
    
    
    cout << "Your intial amount  :" << i << endl;
    
    cout <<"Thank you." <<endl;
}
void BankAccount :: deposit()
{
    
    
    cout <<"Enter name:"<<endl;
    cin >> name;
    cout <<"Enter account number: "<<endl;
    cin >> z;
    cout <<"Enter account type.(personal=1/professional=2):" <<endl;
    cin >> y;
    
    cout <<"How much money you want to deposit?" <<endl;
    cin >> a;
    cout << "Thank you."<<endl;
    cout << "Now total amount in your account becomes :" << i + a <<endl;
}
void BankAccount :: withdraw()
{
    
    cout <<"Enter name:"<<endl;
    cin >> name;
    cout <<"Enter account number: "<<endl;
    cin >> z;
    cout <<"Enter account type.(personal=1/professional=2):" <<endl;
    cin >> y;
    
    cout << "Your initial balance is :" << i <<endl;
    cout << "How much money you want to withdraw?" <<endl;
    cin >> x; 
    cout << "Amount of money withdrawn = " << x <<endl;
    cout << "Thank you." <<endl;
}
void BankAccount :: putdata()
{
    cout << "For deposit(2) and withdrawal(3)." <<endl;
    cin >> b;
   
   

    if(b == 2)
    {
      cout <<"Name : " << name <<endl; // iWANT C =2 THEN ONLY PRINT THIS
      cout <<"Total balance after deposit :" << i + a <<endl;
    }
      
      if(b==3)
      {
          cout <<"Name : " << name <<endl; //IWANT C=3 THEN ONLY PRINT THIS
          cout <<"Total balance after withdrawal :" << i - x <<endl;   
      }

}

int main()
{
    
   BankAccount Member;
  
    do
    {
     cout << "Welcome to NSV bank." << endl;
     cout <<"You can do the following." <<endl;
     cout << " 1 : Check your account."<<endl;
     cout << " 2 : Deposit money." <<endl;
     cout << " 3 : Withdraw money."<<endl;
     cout << " 4 : Check your after deposit/withdrawal." <<endl;
     cout << " 5 : Quit."<<endl;
     cin >> c;
     switch(c)
     {
         case 1 : Member.getinitial();
         break;
        
         case 2 : Member.deposit();
         break;
        
         case 3 : Member.withdraw();
         break;

         case 4 : Member.putdata();
         break;
         
         
         case 5 : break;
        
         default : cout << "Error in input." <<endl;
     }
    }while(c !=5 );
    cout << "Bye." <<endl;
    return 0;
}
         
    
    
    
    