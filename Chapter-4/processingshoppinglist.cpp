#include <iostream>
using namespace std;
const int m=50;
class ITEMS
{
    int count;
    int itemcode[m];
    float itemprice[m];
    
    public:
    void CNT()
    {
        count = 0;
    }
    void getitem();
    void displaySum();
    void remove();
    void displayItems();
};
void ITEMS :: getitem()
{
    cout << "Enter item code :" <<endl;
    cin >> itemcode[count];
    
    cout << "Enter item cost :" <<endl;
    cin >> itemprice[count];
    count++;
}
void ITEMS :: displaySum()
{
    float sum=0;
    for(int i=0; i<count; i++)
    sum = sum + itemprice[i];
    cout <<"Total value :" << sum <<endl;
}
void ITEMS :: remove()
{
    int a;
    cout << "Enter item code :"<<endl;
    cin >> a;
    for(int i=0; i<count; i++)
    if(itemcode[i] == a)
    itemprice[i] = 0;
}
void ITEMS :: displayItems()
{
    cout << "Code Price :" <<endl;
    for(int i=0; i<count; i++)
    {
        cout << "\n" << itemcode[i];
        cout << "  " << itemprice[i];
    }
    cout << "\n";
}
int main()
{
    ITEMS order;
    order.CNT();
    int x;
    do
    {
        cout << "You can do the following" <<endl;
        cout << "Enter appropriate number "<<endl;
        cout << "1 : Add and item" <<endl;
        cout << "2 : Display total value "<<endl;
        cout << "3 : Delete and item"<<endl;
        cout << "4 : Display all items "<<endl;
        cout << "5 : Quit"<<endl;
        cout << "What is your option?"<<endl;
        
        cin >> x;
        switch(x)
        {
            case 1 : order.getitem();
            break;
            
            case 2: order.displaySum();
            break;
            
            case 3 : order.remove();
            break;
            
            case 4 : order.displayItems();
            break;
            
            case 5 : break;
            default : cout << "Error in iunput, try again ";
        }
    } while(x !=5);
    return 0;
}
    
    
    
     