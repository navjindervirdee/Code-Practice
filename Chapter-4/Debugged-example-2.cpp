/*#include <iostream>
using namespace std;
class Room
{
    int width;
    int height;
  
    
    void setvalue(int w, int h)
    {
        width =w;
        height=h;
        cout << "Width :" << w << endl;
        cout << "Height :"<< h <<endl;    
    }
};

int main()
{
    Room objRoom;
    objRoom.width =12;
    
    return 0;
}
*/

#include <iostream>
using namespace std;
class Room
{
    int width;
    int height;
     
    public :
     void setvalue(int w, int h)
    {
        width =w;
        height=h;
        cout << "Width :" << w << endl;
        cout << "Height :"<< h <<endl;    
    }
};

int main()
{
    Room objRoom;
    objRoom.setvalue(12, 10);
    
    return 0;
}
