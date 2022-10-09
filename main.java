public class main{

public static void main(String []args){
LinkedList l=new LinkedList(new Node(1,null));
l.add(new Node(2,null));
l.add(new Node(3,null));
l.add(new Node(4,null));

LinkedList l2=new LinkedList(new Node(1,null));
l2.add(new Node(2,null));
l2.add(new Node(3,null));
l2.add(new Node(4,null));
l2.mergSort(l1,l2);
}
}