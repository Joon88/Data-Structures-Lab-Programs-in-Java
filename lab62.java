/*Circular Queue operations*/

import java.util.Scanner;
class lab62 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the size of the queue we will be dealing with:");
		int rear = 0,front = 0, c, n = scan.nextInt(), ctr = 0;
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
			
			if(c==1){
				if(ctr <= n-1){
					System.out.println("Please enter the data:");
					a[rear] = scan.nextInt();
					System.out.println("Your data has been enqueued");
					rear = (rear+1)%n;
					ctr++;
				}else{
					System.out.println("Queue Overflow");
				}
			}else if(c==2){
				if(ctr == 0){
					System.out.println("Queue Underflow");
				}
				else{
					System.out.println("The data "+a[front]+" has been dequeued");
					a[front] = 0;
					front = (front+1)%n;
					ctr--;
				}
			}else if(c==3){
				System.out.print("The current queue is:");
				if(ctr == 0){
					System.out.println("NULL");
				}else if(front == rear){
					System.out.println();
					for(int i = front ; i < n  ; i++){
						System.out.print(a[i] + "   ");
					}
					for(int i = 0 ; i < front  ; i++){
						System.out.print(a[i] + "   ");
					}
				}
				else{
					System.out.println();
					for(int i = front ; i != rear ; i = (i+1)%n){
						System.out.print(a[i] + "   ");
					}
				}
				System.out.println();
			}else if(c==4){
				return;
			}
		}
	}
}

