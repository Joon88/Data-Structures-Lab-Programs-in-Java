/*  Loop detection in linked list  */

import java.util.Scanner;
class lab422 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int c, elt;
		Node head = null, current = null, tmp = null, ptr, ptr1;
		while(true){
			System.out.println("MENU");
			System.out.println("====");
			System.out.println("1.Insert");
			System.out.println("2.Make Loop");
			System.out.println("3.Detect Loop");
			System.out.println("4.Exit");
			System.out.println("Please enter your choice:");
			c = scan.nextInt();
			
			if(c == 1){
				if(head == null){
					System.out.println("Please enter the data:");
					elt = scan.nextInt();
					current = new Node(elt, 0);
					current.next = null;
					head = current;
				}else{
					System.out.println("Please enter the data:");
					elt = scan.nextInt();
					tmp = new Node(elt, 0);
					tmp.next = null;
					current.next = tmp;
					current = tmp;
				}
			}else if(c == 2){
				if(head == null){
					System.out.println("Sorry, no data to play with");
					return;
				}
				System.out.println("Where do you wanna connect the last node to, give the node number:");
				elt = scan.nextInt();
				ptr = head;
				for(int i = 1 ; i < elt ; i++){
					ptr = ptr.next;
				}
				tmp.next = ptr;
				current.next = ptr;
				System.out.println("Loop formed!!!");
			}else if(c == 3){
				ptr1 = head;
				if(ptr1 == null){
					System.out.println("Sorry, no elements to play with");
					return;
				}
				while(ptr1.next != null && ptr1.flag == 0){
					ptr1.flag++;
					ptr1 = ptr1.next;
				}
				if(ptr1.next == null){
					System.out.println("Sorry, no loop detected!!!");
					return;
				}else{
					System.out.println("Loop Detected");
					return;
				}
			}else if(c == 4){
				return;
			}
		}
	}
}

class Node{
	int data;
	Node next;
	int flag;
	
	public Node(int x, int y){
		data = x;
		flag = y;
	}
}