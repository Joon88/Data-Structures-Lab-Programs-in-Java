/*  Stack Operations using Linked List  */

import java.util.*;
class lab411 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
		ListIterator<Integer> itr;
		int c, elt;
		while(true){
			System.out.println("MENU");
			System.out.println("====");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Display");
			System.out.println("4.Middle Element");
			System.out.println("5.Reversal");
			System.out.println("6.Exit");
			System.out.println("Please enter your choice :");
			c = scan.nextInt();
			
			if(c == 1){
				System.out.println("Enter the element to be entered:");
				elt = scan.nextInt();
				list.push(elt);
			}else if(c == 2){
				if(list.isEmpty()){
					System.out.println("The stack is empty!!!");
				}else{
					System.out.println("The element "+ list.peek() + " is popped!!!");
					list.pop();
				}
			}else if(c == 3){
				itr = list.listIterator();
				while(itr.hasNext()){
					System.out.println(itr.next() + "   ");
				}
				System.out.println();
			}else if(c == 4){
				if(!list.isEmpty())
					System.out.println("The middle element is: " + list.get((int)list.size()/2));
				else
					System.out.println("The stack is empty!!!");
			}else if(c ==5){
				System.out.println("The reversed stack is:");
				Collections.reverse(list);
				itr = list.listIterator();
				while(itr.hasNext()){
					System.out.println(itr.next() + "   ");
				}
				System.out.println();
			}else if(c == 6){
				return;
			}
		}
	}
}
