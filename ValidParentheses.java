import java.util.HashMap;
import java.util.Stack;
import java.util.Scanner;
public class ValidParentheses{
public static boolean isValid(String s){

HashMap<Character,Character>map=new HashMap<>();
map.put(')','(');
map.put('}','{');
map.put(']','[');
Stack<Character>stack=new Stack<>();

for(char a:s.toCharArray()){
if(map.containsKey(a)){
if(stack.isEmpty()||stack.pop()!=map.get(a))
return false;
}
else if(map.containsValue(a))
stack.push(a);

}
return stack.isEmpty();
}
public static void main(String []args){
Scanner scan=new Scanner(System.in);
System.out.println(isValid(scan.nextLine()));

}
}