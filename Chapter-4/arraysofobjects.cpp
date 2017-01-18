#include <iostream>
using namespace std;
class employee
{
    char name[30];
    int age;
    
    public:
     void getdata();
     void putdata();
};

void employee :: getdata()
{
    cout << "Enter name: " <<endl;
    cin >> name;
    cout << "Enter age : " <<endl;
    cin >> age;
}
void employee :: putdata()
{
    cout << "Name :" << name <<endl;
    cout << "Age :" <<age <<endl;
}
const int size =5;

int  main()
{
    
    employee manager[size];
    for(int i=0; i<size; i++)
    {
        cout << "Details of manager" << i + 1<< endl;
        manager[i].getdata();
    }
    for(int i=0; i<size; i++)
    {
        cout << "Manager" << i + 1<< endl;
        manager[i].putdata();
    }
    return 0;
}
   
    
    
     