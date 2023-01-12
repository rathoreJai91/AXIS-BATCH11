package HashMap;

class Node{
    public int data;
    public Node next;

    public Node(int data){
        this.data=data;
        //next=null;
    }
}

public class StackUsingLL {
    
    private Node head;
    private int size;

    public StackUsingLL(){
        head=null;
        size=0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if(head==null){// if(size==0)
            return true;
        }
        
        return false;
    }

    public void push(int elem){
        Node newNode=new Node(elem);
        newNode.next=head;
        head =newNode;
        size++;
    }

    public int top() throws NullPointerException{
        if(head==null){
            throw new NullPointerException();
        }
        return head.data;
    } 

    public int pop() throws NullPointerException{
        if(head==null){
            throw new NullPointerException();
        }

        int remove=head.data;
        head=head.next;
        size--;
        return remove;
    }
}
