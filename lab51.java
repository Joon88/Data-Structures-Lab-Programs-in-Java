/*Stack Operations*/

import java.util.Scanner;
class lab51 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the stack:");
		int top = 0, i, n = scan.nextInt();
		int a[] = new int[n];
		
		while(true){
			System.out.println("MENU");
			System.out.println("====");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Dispaly");
			System.out.println("5.Exit");
			System.out.println("Plese enter your choice:");
			int c = scan.nextInt();
			
			if(c == 1){
				if(top < n){
					System.out.println("Enter the element:");
					a[top] = scan.nextInt();
					top++;
				}else
					System.out.println("Stack Overflow!!!");
			}
			if(c == 2){
				if(top > 0){
					System.out.println("The popped out element is:" + a[top-1]);
					top--;
				}else
					System.out.println("Stack Underflow!!!");
			}
			if(c == 3){
				if(top == 0)
					System.out.println("Stack Underflow!!!");
				else
					System.out.println("The element you are peeking at is:" + a[top-1]);
			}
			if(c == 4){
				i = top-1;
				System.out.println("The current Stack is:");
				while(i >= 0){
					System.out.println(a[i] + "   ");
					i--;
				}
			}
			if(c == 5)
				return;
		}
	}
}
