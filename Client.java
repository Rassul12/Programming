import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Client{

public static void main(String []args)throws Exception{

Socket s=new Socket("localhost",3333);  
DataInputStream din=new DataInputStream(s.getInputStream());  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
String str="",str2="";  
while(true){  
str=br.readLine();  
dout.writeUTF(str);  
dout.flush();  
if(str.equals("stop"))
break;
str2=din.readUTF();  
System.out.println("Server says: "+str2);  
}  
  
dout.close();  
din.close();
s.close();  
}
}