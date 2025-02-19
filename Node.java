
public class Node {
    int data;
    Node next;
    Node prev;

    Node(){
        this.data=-1;
        this.next=null;
        this.prev=null;
    }
      Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
      Node(int data,Node next){
        this.data=data;
        this.next=next;
        this.prev=null;
    }
    Node(int data,Node prev,Node next){
      this.data=data;
      this.next=next;
      this.prev=prev;
  }
}