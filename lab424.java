/*  Swapping consecutive elements of a linked list  */

import java.util.*;
class lab424 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int c, elt, temp;
		LinkedList<Integer> list = new LinkedList<Integer>();
		ListIterator<Integer> itr;
		
		while(true){
			System.out.println("MENU");
			System.out.println("====");
			System.out.println("1.Insert");
			System.out.println("2.Dispaly");
			System.out.println("3.Swap");
			System.out.println("4.Exit");
			System.out.println("Please enter your choice:");
			c = scan.nextInt();
			
			if(c == 1){
				System.out.println("Please enter the element:");
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
				for(int i = 0 ; i < (list.size()-1) ; i += 2){
					temp = list.get(i);
					list.set(i, list.get(i+1));
					list.set(i+1, temp);
				}
				System.out.println("Swapping done...");
			}else if(c == 4){
				return;
			}
		}
	}
}
