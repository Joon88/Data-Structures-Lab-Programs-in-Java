/*  Circular Linked List  */

import java.util.Scanner;
class scc {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int c, elt;
		Node head = null, current = null, ptr = null, tmp = null, tmp1 = null;
		
		while(true){
			System.out.println("MENU");
			System.out.println("====");
			System.out.println("1.Insert");
			System.out.println("2.Display");
			System.out.println("3.Delete");
			System.out.println("4.Exit");
			System.out.println("Please enter your choice:");
			c = scan.nextInt();
			
			if(c == 1){
				if(head == null){
					System.out.println("Enter the element:");
					elt = scan.nextInt();
					current = new Node(elt);
					current.next = null;
					head = current;
					current.next = head;
				}else{
					System.out.println("Enter the element:");
					elt = scan.nextInt();
					ptr = new Node(elt);
					ptr.next = head;
					current.next = ptr;
					current = ptr;
				}
			}else if(c == 2){
				if(head == null){
					return;
				}
				tmp = head;
				System.out.println("The current cirular list contains:");
				System.out.print(tmp.data + "   ");
				//if(tmp.next != tmp){
					while(tmp.next != head){
						tmp = tmp.next;
						System.out.print(tmp.data + "   ");
					//}
				}
				System.out.println();
			}else if(c == 3){
				if(head == null){
					return;
				}
				System.out.println("Please enter the element to be deleted:");
				elt = scan.nextInt();
				tmp = head;
				while(tmp.next.data != elt && tmp.next != head){
					tmp = tmp.next;
				}
				if(tmp.next.data != elt){
					System.out.println("Element not in the list!!!");
					return;
				}
				tmp1 = tmp;
			    tmp1 = tmp1.next;
			    if(tmp == tmp1){
			    	System.out.println("The element "+ tmp.data + " has been deleted and list is empty");
			    	return;
			    }
			    tmp.next = tmp1.next;
			    if(tmp1 == head)
			    	head = head.next;
			    else if(tmp1 == ptr){
			    	ptr = tmp;
			    	current = tmp;
			    }
				System.out.println("The element "+ tmp1.data + " has been deleted");
				tmp1 = null;
			}else if(c == 4){
				return;
			}
		}
	}
}

class Node{
	int data;
	Node next;
	
	public Node(int x){
		data = x;
	}
}
