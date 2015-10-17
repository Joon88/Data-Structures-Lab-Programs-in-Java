/*  Merge two sorted lists  */

import java.util.*;
public class lab434 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		LinkedList<Integer> list3 = new LinkedList<Integer>();
		ListIterator<Integer> itr1, itr2, itr3;
		
		int c, elt, i, j;
		
		while(true){
			System.out.println("MENU");
			System.out.println("====");
			System.out.println("1.Insert the first list");
			System.out.println("2.Insert the second list");
			System.out.println("3.Merge");
			System.out.println("4.Display");
			System.out.println("5.Exit");
			System.out.println("Please enter your choice:");
			c = scan.nextInt();
			
			if(c == 1){
				System.out.println("Enter the data:");
				elt = scan.nextInt();
				list1.add(elt);
			}else if(c == 2){
				System.out.println("Enter the data:");
				elt = scan.nextInt();
				list2.add(elt);
			}else if(c == 3){
				Collections.sort(list1);
				Collections.sort(list2);
				for(i = 0 , j = 0 ; i < list1.size() && j < list2.size() ;){
					if(list1.get(i) < list2.get(j)){
						list3.add(list1.get(i));
						i++;
					}else{
						list3.add(list2.get(j));
						j++;
					}
				}
				if(i >= list1.size()){
					while(j < list2.size()){
						list3.add(list2.get(j));
						j++;
					}
				}else{
					while(i < list1.size()){
						list3.add(list1.get(i));
						i++;
					}
				}
				System.out.println("The lists have been merged");
			}else if(c == 4){
				itr1 = list1.listIterator();
				itr2 = list2.listIterator();
				itr3 = list3.listIterator();
				System.out.println("The first list is:");
				while(itr1.hasNext()){
					System.out.print(itr1.next() + "   ");
				}
				System.out.println();
				System.out.println("The second list is:");
				while(itr2.hasNext()){
					System.out.print(itr2.next() + "   ");
				}
				System.out.println();
				System.out.println("The merged list is:");
				while(itr3.hasNext()){
					System.out.print(itr3.next() + "   ");
				}
				System.out.println();
			}else if(c == 5){
				return;
			}
		}
	}
}
