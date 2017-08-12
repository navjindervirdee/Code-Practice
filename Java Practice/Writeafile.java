import java.io.*;
class Writeafile{
public static void main(String [] args){
try {
FileWriter writer = new FileWriter("read.txt");
writer.write("hello");
writer.close();
}

catch(IOException ex){
 ex.printStackTrace();
}
}
}
