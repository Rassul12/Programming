import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSide {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s=new Socket("localhost",5555);
		DataInputStream in = new DataInputStream(s.getInputStream());
		DataOutputStream out = new DataOutputStream(s.getOutputStream());
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
         String str="",str2="";
         while(!str.equals("stop")) {
        	 str=b.readLine();
        	 out.writeUTF(str);
        	 str2=in.readUTF();
        	 System.out.println("Server :"+str2);
         }
         in.close();
         out.close();
         b.close();
	}

}
