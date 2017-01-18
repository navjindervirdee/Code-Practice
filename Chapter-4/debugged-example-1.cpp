/*#include <iostream>
struct Room
{
    int width;
    int length;
    
    void setvalue(int w, int l)
    {
        width =w;
        length=l;
    }
};

int main()
{
    Room objRoom;
    objRoom.setvalue(12, 1,4);
    
    return 0;
}
*/
#include <iostream>
using namespace std;
struct Room
{
    int width;
    int length;
    
    void setvalue(int w, int l)
    {
        width =w;
        length=l;
        cout << "Width :" << w << endl;
        cout << "Length :"<< l <<endl;
        
    }
};

int main()
{
    Room objRoom;
    objRoom.setvalue(12, 14);
    
    return 0;
}
