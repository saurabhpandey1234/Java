package Linkedlists;

public class Doublelinkedlist {
	class Node{  
        int data;  
        Node previous;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
	Node head, tail = null; 
    public void addNode(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  
  
        //If list is empty  
        if(head == null) {  
            //Both head and tail will point to newNode  
            head = tail = newNode;  
            //head's previous will point to null  
            head.previous = null;  
            //tail's next will point to null, as it is the last node of the list  
            tail.next = null;  
        }  
        else {  
            //newNode will be added after tail such that tail's next will point to newNode  
            tail.next = newNode;  
            //newNode's previous will point to tail  
            newNode.previous = tail;  
            //newNode will become new tail  
            tail = newNode;  
            //As it is last node, tail's next will point to null  
            tail.next = null;  
        }  
    }  
  
    //print out the nodes of the list  
    public void display() {  
        
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
    }  
    
	public static void main(String[] args) {
		
		Doublelinkedlist List = new Doublelinkedlist();  
	       
	        List.addNode(1);  
	        List.addNode(2);  
	        List.addNode(3);  
	        List.addNode(4);  
	        List.addNode(5);  
	        List.addNode(6);  
	        List.addNode(7);  
	        List.addNode(8);  
	        List.addNode(9);  
	        //Displays the nodes present in the list  
	        List.display();  
	}

}
