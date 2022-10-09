import java.net.*;
public class URLDemo{

public static void main(String []args)throws Exception{
URL url=new URL("http://www.google.com/search?q=Hello");
System.out.println("Protocol :"+url.getProtocol());
System.out.println("HostName :"+url.getHost());
System.out.println("File :"+url.getFile());
System.out.println("Port :"+url.getPort());
}
}