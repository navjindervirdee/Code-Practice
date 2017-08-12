#include <iostream>
using namespace std;
int main()
{
    int num[10],sum=0;
    cout <<"Enter 10 numbers"<<endl;
    for(int i=1; i<=10; i++)
    {
        cout <<"Number "<< i <<" : " <<endl;
        cin >> num[i];
    }
    for(int j=1; j<=10; j++)
    {
        sum=sum+num[j];
    }
    float average=sum/10.0;
    cout <<"Average = "<<average <<endl;
    float max = num[1];
    for(int k=1; k<=10; k++)
    {
        if(num[k]>max)
        {
            max=num[k];
        }
    }
    cout <<"Maximum value : "<< max <<endl;
    float min = num[1];
    for(int g=1; g<=10; g++)
    {
        if(num[g]<min)
        {
           min=num[g];
        }
    }
    cout <<"Minimum value : "<< min <<endl;
    return 0;
}
  