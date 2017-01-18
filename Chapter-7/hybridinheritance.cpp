#include <iostream>
using namespace std;
class student
{
    protected :
    int a;
    
    public :
    void get_number();
    void put_number(void);
};
void student :: get_number()
{
    cout <<"Enter your roll number :" <<endl;
    cin >>a;
}
void student :: put_number()
{
    cout <<"\nRoll Number ="<<a<<endl;
}
class test : public student
{
    protected :
    float sub1, sub2;
    
    public :
    void get_marks(float x, float y)
    {
        sub1=x;
        sub2=y;
    }
    void put_marks()
    {
        cout <<"Marks in Sub1(max=50)   ="<<sub1 <<endl;
        cout <<"Marks in Sub2(max=50)   ="<<sub2 <<endl;
    }
};
class sports
{
    protected :
    float score;
    
    public :
    void get_score(float s)
    {
        score=s;
    }
    void put_score()
    {
        cout <<"Score in sports(max=20) ="<<score <<endl;
    }
};
class result : public test, public sports
{
    float total;
    
    public :
    void display()
    {
        total =sub1 + sub2 + score;
        put_number();
        put_marks();
        put_score();
        cout <<"\nTotal(max=120) =" << total <<endl;
    }
};
int main()
{
    result student1;
    student1.get_number();
    student1.get_marks(40, 50);
    student1.get_score(18);
    student1.display();
    cout <<"\nGreat marks Navjinder.Well done."<<endl;
    return 0;
}
        
