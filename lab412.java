/*  Adding two numbers with each digits stored in separate nodes  */

import java.util.*;
class lab412 {
	public static void main(String args[]){
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> rslt;
		ListIterator<Integer> itr, itr2, itr3;
		Scanner scan = new Scanner(System.in);
		int c, elt, carry = 0, i = 1, j = 1, num1, num2;
		while(true){
			System.out.println("MENU");
			System.out.println("====");
			System.out.println("**NUMBERS ARE REQUIRED TO BE ENTERED DIGIT AFTER DIGIT**");
			System.out.println("1.Enter the first number");
			System.out.println("2.Enter the second number");
			System.out.println("3.Display the entered numbers");
			System.out.println("4.Sum");
			System.out.println("5.Exit");
			System.out.println("Please enter your choice: ");
			c = scan.nextInt();
			
			if(c == 1){
				System.out.println("Please enter the "+ i + " digit:");
				elt = scan.nextInt();
				list.add(elt);
				i++;
			}else if(c == 2){
				System.out.println("Please enter the "+ j + " digit:");
				elt = scan.nextInt();
				list2.add(elt);
				j++;
			}else if(c == 3){
				System.out.println("The first number is :");
				itr = list.listIterator();
				while(itr.hasNext()){
					System.out.print(itr.next());
				}
				System.out.println();
				System.out.println("The second nmber is :");
				itr2 = list2.listIterator();
				while(itr2.hasNext()){
					System.out.print(itr2.next());
				}
				System.out.println();
			}else if(c == 4){
				rslt = new ArrayList<Integer>();
				itr = list.listIterator(list.size());
				itr2 = list2.listIterator(list2.size());
				if(list2.size() > list.size()){
					while(itr.hasPrevious()){
						num1 = itr.previous();
						num2 = itr2.previous();
						rslt.add((num1 + num2 + carry)%10);
						carry = (num1 + num2 + carry)/10;
					}
					while(itr2.hasPrevious()){
						num2 = itr2.previous();
						rslt.add((num2 + carry)%10);
						carry = (num2 + carry)/10;
					}
				}
				else{
					while(itr2.hasPrevious()){
						num1 = itr.previous();
						num2 = itr2.previous();
						rslt.add((num2+ num1 + carry)%10);
						carry = (num2 + num1 + carry)/10;
					}
					while(itr.hasPrevious()){
						num1 = itr.previous();
						rslt.add((num1 + carry)%10);
						carry = (num1 + carry)/10;
					}
				}
				rslt.add(carry);
				
				itr3 = rslt.listIterator(rslt.size());
				System.out.println("The required sum is:");
				while(itr3.hasPrevious()){
					System.out.print(itr3.previous());
				}
				System.out.println();
			}else if(c == 5){
				return;
			}
		}
	}
}
