import java.util.*;
//To insert new node to the front (AddFront): <- KILLER FEATURE
/* 1) create new node
 * 2) point new node to head
 * 3) point head to new node
 * 4) T.C of O(1)
 * THAT's IT!
 */
// API Stacks(LIFO) & Queues(FIFO) are built on top of DS like linkedlists,arrays,vectors,arraylists
// Stacks Ops: push (insert) & pop(remove)
// Queues Ops: enqueue & dequeue
public class LinklyList {
	static ArrayList<Integer> storage = new ArrayList<Integer>();
	
	static class Node{
		private int data;
		Node next;
		private Node head;
		private int counter = 0;
		
				
		public Node(int data) {
			this.data = data;
			
		}
		
		//T.C = O(1)
		public void addFront(int data){
			counter++;
			//Create new node;
			Node newNode = new Node(data);
			
			//if list is empty...
			if(head == null){
				head = newNode;
				return;
			}
			//Set our new node next ptr to current head pointer
			newNode.next = head;
			
			//Current head point to newNode... head becomes the newNode... therefore adding it to front of list
			head = newNode;
			
		}
		
		//T.C = O(1)
		public int getFirst(){
			//if head == null throw an empty exception to say it's an empty linkedlist
			return head.data;
		}
		
		//T.C = O(1)
		public int getLast(){
			if(head == null){
				throw new IllegalStateException("Empty List");
			}
			Node current = head;
			while(current.next !=null){
				current = current.next;
			}
			//once out of while loop, we're now at the tail
			return current.data;
		}
		
		//T.C = O(n)
		public void addBack(int data){
			Node newNode = new Node(data);
			Node current = null;
			
			if(head == null){
				head = newNode;
				counter++;
				return;
			}
			current = head;
			while(current.next != null){
				current = current.next; 
			}
			
			current.next = newNode;
			//newNode.next = null;
			counter++;
		}
		
		//Two ways to do size, you can make a private variable counter that increments
		//when you insert and decrements when you remove, that way your size is always known.
		//OR you can do what's below which is brute force... this is an O(n) operation and is costly.
		
		public int size(){
			if(head == null){
				return 0;
			}
			else {
				
			int count = 1;		//because we've already counted head node at this point
			
			Node temPtr = head;
			
			while(temPtr.next != null){
				count++;
				temPtr = temPtr.next;
				
			}
			
			return count;
			
			}
		}
		
		//T.C = O(1)
		public void clear(){
		head = null;
		counter = 0;
			}
		
		
		
		//T.C = O(n)
		public void DeleteVal(int data) {
			//Note: value isn't actually deleted, it still exists somewhere on the machine.
			// 		though we're just bypassing/skipping it int he list
			if(head == null){
				return;
			}
			
			if(head.data == data){
				head = head.next;
				counter--;
				return;
			}
			
			Node current = head;
			while(current.next != null){
				if(current.next.data == data){
					current.next = current.next.next;
					counter--;
					
					return;
				}
				current = current.next;
			}
			if(current.next == null){
				System.out.println(data + " is not in list");
			}
			
			
		}
		
		//T.C = O(n)
		void Print(String text){
			if(head == null){
				System.out.println("list is empty");
			}
			
			Node current = head;
			while(current != null){
				storage.add(current.data);
				current = current.next;
				
			}
			System.out.println(text);
			System.out.println(storage);
			storage.clear();
		}
	
		//T.C = O(1)
		void getCounter(){
			System.out.println(counter);
		}
		
		//T.C = O(n)
		void middleNode(){
			Node slow = head;
			Node fast = head;
			if(head!=null){
				while(fast != null && fast.next != null){
					fast = fast.next.next;
					slow = slow.next;
				}
				System.out.println("Middle Element is: " + slow.data);
			}
		}

		
		//Works but doesn't work for num (in main) <=2
//		void getMiddle(){
//			Node temp = head;
//			if(head == null){
//				throw new IllegalStateException("Empty List");
//
//			}
//			int size=1;
//			
//		while(temp.next != null){
//			size++;
//			storage.add(temp.data);
//			temp = temp.next;
//		}
//		System.out.println("Middle Element (getMiddle()) is: " + storage.get(size/2));
//			storage.clear();
//		}
		
		boolean circular(){
			
			Node fast = head;
			Node slow = head;
			if(head!=null){
				while(fast != null && fast.next != null){
					fast = fast.next.next;
					slow = slow.next;
					if(slow == fast){
						return true;
						
					}
				}
			}
			return false;
		}
		
		public void reverse(){
			Node ptr = head;
			Node prev=null, current=null;
			while(ptr!=null){
				current = ptr;
				ptr = ptr.next;
				//reversing links
				current.next = prev;
				prev = current;
				head = current;
			}
		}
		
//		public void duplicate(){
//			ArrayList<Integer>d = new ArrayList<Integer>();
//			Node traverser = head;
//			while(traverser.next!=null){
//				if(traverser.next.data == head.data){
//					traverser.next = traverser.next.next;			
//				}
//				d.add(traverser.data);
//				traverser = traverser.next;
//			}
//			System.out.print(d);
//		}
		public void sortedInsert(int data){
			if(head == null){
				addFront(data);
				return;
			}
			Node newNode = new Node(data);
			Node temp = head;
			
			if(head.data > data){
				newNode.next = head;
				head = newNode;
				return;
			}
			
			
			while(temp.next != null && temp.next.data < data){
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
			return;
		}
		
		public void sorter(){
			
			if(head == null || head.next == null){
				System.out.println("Sorter doesn't apply here");
				return;
			}
			Node i,j;
			i = head;
			int temp=0;
			for(i = head; i!=null; i = i.next){
				for(j = i.next; j!=null; j = j.next){
					if(i.data > j.data){
						temp = i.data;
						i.data = j.data;
						j.data = temp;
					}
				}

			}

			return;
			
			
			
		}

		
	}
	
		
	
	

}
