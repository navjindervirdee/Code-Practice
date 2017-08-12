import java.io.*;
public class Filee{
public static void main(String [] args)throws IOException{
FileReader in=null;
FileWriter out =null;

try{
in =new FileReader("yo.txt");
out = new FileWriter("t.txt");
int c;
while((c=in.read()) !=-1){
out.write(c);
}
}
finally{
if(in != null){
in.close();
}
if(out != null){
out.close();
}
}
}
}


