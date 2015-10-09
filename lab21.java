import java.util.Scanner;
class lab21 {
	public static void main(String args[]){
		int r, c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		r = scan.nextInt();
		System.out.println("Enter the number of columns :");
		c = scan.nextInt();
		int[][] a = new int[r][c];
		System.out.println("Please enter the matrix:");
		for(int i = 0 ; i < r ; i++){
			for(int j = 0 ; j < c ; j++){
				a[i][j] = scan.nextInt();
			}
		}
		System.out.println("Thanks....");
		System.out.println("Your input is :");
		for(int i = 0 ; i < r ; i++){
			for(int j = 0 ; j < c ; j++){
				System.out.print(a[i][j] + "   ");
			}
			System.out.println();
		}
		System.out.println("The result is :");
		int flag = 0, ctr = 0;
		while(flag == 0){
			flag = 1;
			for(int j = 0+ctr ; j < c-ctr ; j++){
				System.out.print(a[0+ctr][j] + "   ");
				flag = 0;
			}
			if(flag == 0){
				flag = 1;
				for(int i = (1+ctr) ; i < (r-ctr) ; i++){
					System.out.print(a[i][c-1-ctr] + "   ");
					flag = 0;
				}
			}
			if(flag == 0){
				flag = 1;
				for(int j = (c-2-ctr) ; j >= (0+ctr) ; j--){
					System.out.print(a[r-1-ctr][j] + "   ");
					flag = 0;
				}
			}
			if(flag == 0){
				flag = 1;
				for(int i = (r-2-ctr) ; i >= (1+ctr) ; i--){
					System.out.print(a[i][0+ctr] + "   ");
					flag = 0;
				}
			}
			ctr++;
		}
	}
}
