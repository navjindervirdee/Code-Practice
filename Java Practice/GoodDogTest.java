class GoodDog{
private int size;

public int getSize(){
return size;
}

public  void setSize(int s){
size=s;
}

void bark(){
if(size>60){
System.out.println("woof");
}
else{
System.out.println("ruff");
}
}
}

class GoodDogTest{
public static void main(String [] args){
GoodDog d=new GoodDog();
GoodDog e=new GoodDog();
d.setSize(70);
System.out.println("Dog d " + d.getSize());
d.bark();
e.setSize(45);
System.out.println("Dog e " + e.getSize());
e.bark();
}
}