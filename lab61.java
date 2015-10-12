/*Normal Queue operations*/

import java.util.Scanner;
class lab61 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the size of the queue we will be dealing with:");
		int rear = -1,front = -1, c, n = scan.nextInt();
		int a[] = new int[n];
		while(true){
			System.out.println("MENU");
			System.out.println("====");
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.Display");
			System.out.println("4.Exit");
			System.out.println("Please enter your choice:");
			c = scan.nextInt();
			
			if(front == n-1 && rear == n-1){
				System.out.println("The queue is used up and is empty now!!!!");
				return;
			}
			
			if(c==1){
				rear++;
				if(rear <= n-1){
					System.out.println("Please enter the data:");
					a[rear] = scan.nextInt();
					System.out.println("Your data has been enqueued");
				}else{
					System.out.println("Queue Overflow");
					rear--;
				}
			}else if(c==2){
				front++;
				if(rear == -1){
					System.out.println("Queue Underflow");
					front--;
				}
				else{
					System.out.println("The data "+a[front]+" has been dequeued");
					a[front] = 0;
				}
			}else if(c==3){
				System.out.println("The current queue is:");
				for(int i = (front+1) ; i <= rear ; i++){
					System.out.print(a[i] + "   ");
				}
				System.out.println();
			}else if(c==4){
				return;
			}
		}
	}
}
