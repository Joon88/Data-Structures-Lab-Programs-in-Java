/*  Rotation or reversing of the elements of a linked list  */

import java.util.*;
class lab425 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
		ListIterator<Integer> itr;
		int c, elt;
		
		while(true){
			System.out.println("MENU");
			System.out.println("1.Insert");
			System.out.println("2.Display");
			System.out.println("3.Rotate or reverse");
			System.out.println("4.Exit");
			System.out.println("Please enter your choice:");
			c = scan.nextInt();
			
			if(c == 1){
				System.out.println("Please enter thr element:");
				elt = scan.nextInt();
				list.add(elt);
			}else if(c == 2){
				System.out.println("The current list is:");
				itr = list.listIterator();
				while(itr.hasNext()){
					System.out.print(itr.next() + "   ");
				}
				System.out.println();
			}else if(c == 3){
				Collections.reverse(list);
				System.out.println("The list has been reversed or rotated");
			}else if(c == 4){
				return;
			}
		}
	}
}
