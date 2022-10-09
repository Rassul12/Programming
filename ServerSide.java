import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {

	public static void main(String[] args) throws IOException {
		ServerSocket s=new ServerSocket(5555);
		Socket ss=s.accept();
		DataInputStream in=new DataInputStream(ss.getInputStream());
		DataOutputStream out=new DataOutputStream(ss.getOutputStream());
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String str1="",str2="";
		while(!str1.equals("stop")){
			str1=in.readUTF();
			System.out.println("Client :"+str1);
			str2=bf.readLine();
			out.writeUTF(str2);
			out.flush();
			
		}
		in.close();
		out.close();
		bf.close();

	}

}
