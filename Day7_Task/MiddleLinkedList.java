import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Node head=null,temp=null;
        for (int i=0;i<num;i++) {
            int value=sc.nextInt();
            Node newNode=new Node(value);
            if (head==null) {
                head=newNode;
                temp=newNode;
            } else {
                temp.next=newNode;
                temp=newNode;
            }
        }
        Node pre=null;
        Node current=head;
        while (current!=null){
            Node next=current.next;
            current.next=pre;
            pre=current;
            current=next;
        }
        head=pre;
        Node tem=head;
        while (tem!=null){
            System.out.println(tem.data);
            tem=tem.next;
        }
    }
}