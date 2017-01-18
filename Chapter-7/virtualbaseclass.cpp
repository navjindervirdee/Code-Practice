#include <iostream>
using namespace std;
class student
{
    protected :
    int a;
    
    public :
    void get_number()
    {
        cout <<"Enter your roll number :" <<endl;
        cin >> a;
    }
    void put_number()
    {
        cout << "Roll Number =" << a << endl;
    }
};
class test : virtual public student
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
        cout <<"Marks in Sub1 =" << sub1 <<endl;
        cout <<"Marks in Sub2 =" << sub2 <<endl;
    }
};
class sports : public virtual student
{
    protected :
    float score;
    
    public :
    void get_score(float b)
    {
        score =b;
    }
    void put_score()
    {
        cout <<"Score in sports ="<<score <<endl;
    }
};
class result : public test, public sports
{
    float total;
    
    public :
    void display()
    {
        total =sub1 +sub2 +score;
        put_number();
        put_marks();
        put_score();
        cout <<"Total =" <<total <<endl;
    }
};
int main()
{
    result student1;
    student1.get_number();
    student1.get_marks(80,90);
    student1.get_score(45);
    student1.display();
    return 0;
}
    
    
    
    