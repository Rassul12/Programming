import java.net.URL;
import java.io.*;    
import java.net.HttpURLConnection;
public class HttpConnection{

public static void main(String []args)throws Exception{
URL url=new URL("https://www.youtube.com/");
HttpURLConnection huc=(HttpURLConnection)url.openConnection();
for(int i=1;i<=8;i++){
System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i) );
}
huc.disconnect();
}

}