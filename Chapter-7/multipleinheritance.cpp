#include <iostream>
using namespace std;
class M
{
    protected :
    int m;
    
    public :
    void get_m();
};
class N
{
    protected :
    int n;
    
    public :
    void get_n();
};
class P : public M, public N
{
    public :
    void display();
};
void M :: get_m()
{
    cout <<"Enter value of m :"<<endl;
    cin >> m;
}
void N :: get_n()
{
    cout <<"Enter value of n :" <<endl;
    cin >> n;
}
void P :: display()
{
    cout << "m   =" << m <<endl;
    cout << "n   =" << n <<endl;
    cout << "m*n =" << m*n <<endl;
}
int main()
{
    P p;
    p.get_m();
    p.get_n();
    p.display();
    return 0;
}