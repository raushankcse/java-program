package LinkedList;

public class LinkedList3 {
    
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    Node head;
    public void swapNodes(int x, int y){
        if(x==y)
            return;
        
        Node prevX = null, currX = head;
        while(currX!=null && currX.data != x){
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null, currY = head;
        while(currY != null && currY.data !=y){
            prevY = currY;
            currY = currY.next;
        }

        if(currX == null || currY == null)
            return;
        
        if(prevX!=null)
            prevX.next = currY;
        else 
            head = currY;
        
        if(prevY!=null)
            prevY.next = currX;
        else 
            head = currX;
        
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    public void push(int new_data){
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;
    }

    public void printList(){
        Node tNode = head;
        while(tNode!= null){
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
    }

    public static void main(String args[]){
        LinkedList3 list = new LinkedList3();

        list.push(7);
        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);

        System.out.print("\n Linked list before");
        list.printList();

        list.swapNodes(1, 7);
        System.out.print("\n Linked list after");

        list.printList();
    }
}
