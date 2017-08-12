class ElectricGuitar{
int size;

int getSize(){
return size;
}

void setSize(int num){
size=num;
System.out.print("size =" + size);
}

}
class TestGuitar{
public static void main(Strings [] args){
ElectricGuitar e= new ElectricGuitar();
e.getSize();
e.setSize();
}
}