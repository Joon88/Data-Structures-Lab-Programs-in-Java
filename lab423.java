/*  Detection of Y  */

import java.util.Scanner;
class lab423 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int c, elt;
		Node head1 = null, head2 = null, current1 = null, current2 = null, tmp1 = null, tmp2 = null, ptr, ptr2, ptr1;
		while(true){
			System.out.println("MENU");
			System.out.println("====");
			System.out.println("1.Insert the longer list");
			System.out.println("2.Insert the shorter list");
			System.out.println("3.Make Y");
			System.out.println("4.Detect Y");
			System.out.println("5.Exit");
			System.out.println("Please enter your choice:");
			c = scan.nextInt();
			
			if(c == 1){
				if(head1 == null){
					System.out.println("Please enter the data:");
					elt = scan.nextInt();
					current1 = new Node(elt, 1);
					current1.next = null;
					head1 = current1;
				}else{
					System.out.println("Please enter the data:");
					elt = scan.nextInt();
					tmp1 = new Node(elt, 1);
					tmp1.next = null;
					current1.next = tmp1;
					current1 = tmp1;
				}
			}else if(c == 2){
				if(head2 == null){
					System.out.println("Please enter the data:");
					elt = scan.nextInt();
					current2 = new Node(elt, 0);
					current2.next = null;
					head2 = current2;
				}else{
					System.out.println("Please enter the data:");
					elt = scan.nextInt();
					tmp2 = new Node(elt, 0);
					tmp2.next = null;
					current2.next = tmp2;
					current2 = tmp2;
				}
			}else if(c == 3){
				if(head1 == null || head2 == null){
					System.out.println("Sorry, no Y can be formed");
					return;
				}
				System.out.println("In which node do u wanna connect the shorter list to, give node number:");
				elt = scan.nextInt();
				ptr = head1;
				for(int i = 1 ; i < elt ; i++){
					ptr = ptr.next;
				}
				tmp2.next = ptr;
				current2.next = ptr;
				System.out.println("Y formed!!!");
			}else if(c == 4){
				ptr1 = head1;
				ptr2 = head2;
				if(ptr1 == null || ptr2 == null){
					System.out.println("Sorry, no elements to play with");
					return;
				}
				while(ptr2.next != null && ptr2.flag == 0){
					ptr2 = ptr2.next;
				}
				if(ptr2.next == null){
					System.out.println("Sorry, no Y detected!!!");
					return;
				}else{
					System.out.println("Y Detected at the element "+ ptr2.data);
					return;
				}
			}else if(c == 5){
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
