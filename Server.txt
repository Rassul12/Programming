import java.net.Socket;
import java.net.ServerSocket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Server{
public static void main(String []args)throws Exception{

ServerSocket ss=new ServerSocket(3333);  
Socket s=ss.accept();  //socket 
DataInputStream din=new DataInputStream(s.getInputStream());  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
String str="",str2="";  
while(true){  
str=din.readUTF(); 
if(str.equals("stop"))
break; 
System.out.println("client says: "+str);  
str2=br.readLine();  
dout.writeUTF(str2);  
dout.flush();  
}  
din.close();  
dout.close();
s.close();  
ss.close();  
}
}