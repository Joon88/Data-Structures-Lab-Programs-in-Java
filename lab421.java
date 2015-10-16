/*  Middle element reversal  */

import java.util.*;
class lab421 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		ListIterator<Integer> itr;
		int c, elt, mid, temp;
		
		while(true){
			System.out.println("MENU");
			System.out.println("1.Insert");
			System.out.println("2.Reverse middle element");
			System.out.println("3.Display");
			System.out.println("4.Exit");
			System.out.println("Please enter your choice : ");
			c = scan.nextInt();
			
			if(c == 1){
				System.out.println("Please enter the element : ");
				elt = scan.nextInt();
				list.add(elt);
			}else if(c == 2){
				if(!list.isEmpty()){
					mid = list.size()/2;
					temp = list.get(mid);
					list.set(mid, list.get(mid - 1));
					list.set(mid - 1, temp);
					System.out.println("The middle elements have been reversed");
				}
			}else if(c == 3){
				System.out.println("The current list is:");
				itr = list.listIterator();
				while(itr.hasNext()){
					System.out.print(itr.next() + "   ");
				}
				System.out.println();
			}else if(c == 4){
				return;
			}
		}
	}
}
