class Dog{
int size;
String name;

void bark(){
if(size>70){
System.out.print("woof, woof");
}
else if(size>14){
System.out.println("ruff");
}
else{
System.out.println("yipp");
}
}
}

class DogTestdrive{
public static void main(String [] args){
Dog one=new Dog();
one.size=80;
Dog two=new Dog();
two.size=34;
Dog three=new Dog();
three.size=3;
one.bark();
two.bark();
three.bark();
}
}