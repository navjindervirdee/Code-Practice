import java.io.*;
public class Output{
public static void main(String [] args)throws IOException{

FileOutputStream f= new FileOutputStream("file.txt");
FileInputStream f1= new FileInputStream("yo.txt");
String str="navjinder Singh virdee";
byte [] b= str.getBytes();
for(int i=0; i<b.length;i++){
f.write(b[i]);
}
f.close();
int c;
while((c=f1.read())!=-1){
System.out.print((char) c);
}

}
}
