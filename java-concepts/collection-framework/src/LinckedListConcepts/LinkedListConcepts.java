package LinckedListConcepts;

public class LinkedListConcepts {
	
Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public void printMyLinkedList() {
		Node n = head;
		
		while(n!=null) {
			System.out.print(n.data);
			n=n.next;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedListConcepts li = new LinkedListConcepts();
		
		Node first = li.new Node(10);
		li.head = first;
		
		Node second = li.new Node(10);
		first.next = second;
		
		Node third = li.new Node(10);
		second.next = third;
		
		
		li.printMyLinkedList();
	}

}
