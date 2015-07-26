#include <iostream>
using namespace std;
const float i=0.556;
int main()
{
  float temperature, farenheit, celsius;
  cout << "Enter temperature in Farenheit:"<<endl;
  cin >> farenheit;
  celsius = (farenheit-32)*i;
  cout << "Temperature in celsius:" << celsius <<endl;
  return 0;
}