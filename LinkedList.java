public class LinkedList{
Node head,tail;
public LinkedList(Node n){
head=n;
tail=head;
}
public LinkedList(Node n){
head=n;
tail=head;
}
public void add(Node newNode){
tail.Next=newNode;
tail=newNode;
} 
public void mergeSort(Node n1,Node n2){
LinkedList l=new LinkedList(n1.head);
n1.tail.Next=n2;
Node n=n1;
while(n!=null){
System.out.println(n.Value);
n=n.Next;
}
}
}