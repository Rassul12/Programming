import java.util.Scanner;
public class T{

public static void main(String []args){

Scanner scan=new Scanner(System.in);
String str=scan.nextLine();
boolean flag=false;
for(int k=1;k<str.length();k++){


if((str.charAt(k-1)=='('&&str.charAt(k)==')')||(str.charAt(k-1)=='['&&str.charAt(k)==']')||(str.charAt(k-1)=='{'&&str.charAt(k)=='}'))
{
k++;
flag=true;
}
else 
{
flag=false;
break;
}

}
System.out.println(flag);
}
}