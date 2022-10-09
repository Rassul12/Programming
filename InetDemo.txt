import java.net.InetAddress;
public class InetDemo{
public static void main(String []args)throws Exception{
InetAddress i=InetAddress.getByName("www.google.com");
System.out.println("Host Name :"+i.getLocalHost());
System.out.println("IP Address:"+i.getHostAddress());

}
}