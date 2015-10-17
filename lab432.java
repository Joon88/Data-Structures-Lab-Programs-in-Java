/*  Doubly Linked List  */

import java.util.Scanner;
class lab432 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int c, elt;
		node head = null, current = null, ptr = null, tmp = null, tmp1 = null;
		
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
					System.out.println("Enter the data:");
					elt = scan.nextInt();
					current = new node(elt);
					current.next = null;
					current.prev = null;
					head = current;
				}else{
					System.out.println("Enter the data:");
					elt = scan.nextInt();
					ptr = new node(elt);
					ptr.next = null;
					ptr.prev = current;
					current.next = ptr;
					current = ptr;
				}
			}else if(c == 2){
				System.out.println("The current list is:");
				tmp = head;
				while(tmp != null){
					System.out.print(tmp.data + "   ");
					tmp = tmp.next;
				}
				System.out.println();
				System.out.println("The current list in reverse format is:");
				tmp = current;
				while(tmp != null){
					System.out.print(tmp.data + "   ");
					tmp = tmp.prev;
				}
				System.out.println();
			}else if(c == 3){
				if(head == null){
					System.out.println("The list is empty!!!!");
					return;
				}
				System.out.println("Enter the element to be deleted:");
				elt = scan.nextInt();
				tmp = head;
				while((tmp != null) && (tmp.data != elt)){
					tmp = tmp.next;
				}
				if(tmp == null){
					System.out.println("Your data is not in the list");
				}else{
					System.out.println("The data "+ tmp.data + " has been found and deleted");
					if(tmp.next == null && tmp.prev == null){
						head = current = ptr = tmp = null;
						System.out.println("The list is empty!!!");
					}else if(tmp.next == null){
						current = current.prev;
						ptr = ptr.prev;
						tmp.prev = null;
						current.next = ptr.next = tmp = null;
					}else if(tmp.prev == null){
						head = head.next;
						head.prev = null;
						tmp.next = null;
						tmp = null;
					}else{
						tmp1 = tmp.prev;
						tmp.prev = null;
						tmp1.next = tmp.next;
						tmp.next.prev = tmp1;
						tmp.next = null;
						tmp = null;
					}
				}
			}else if(c == 4){
				return;
			}
		}
	}
}

class node{
	int data;
	node next;
	node prev;
	
	public node(int x){
		data = x;
	}
}