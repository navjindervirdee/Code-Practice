import java.io.*;
class Show{
public static void main(String [] args)throws IOException{
int i;
FileInputStream fin;
try{
fin = new FileInputStream("C:/Users/atley/Desktop/JavaPrograms/t");
}
catch(FileNotFoundException e){
System.out.println("File not found");
return;
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println(e);
return;
}


do{
i=(char)fin.read();
if(i != -1){
System.out.println((char) i);
} 
}
while(i != -1);
fin.close();


}
}

