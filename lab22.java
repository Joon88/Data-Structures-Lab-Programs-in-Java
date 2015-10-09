import java.util.Scanner;
class lab22 {
	public static void main(String args[]){
		int r, c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		r = scan.nextInt();
		System.out.println("Enter the number of columns :");
		c = scan.nextInt();
		int a[][] = new int[r][c];
		System.out.println("Please enter the elements :");
		for(int i = 0 ; i < r ; i++){
			for(int j = 0 ; j < c ; j++){
				a[i][j] = scan.nextInt();
			}
		}
		System.out.println("Thanks.....");
		System.out.println("The input matrix is :");
		for(int i = 0 ; i < r ; i++){
			for(int j = 0 ; j < c ; j++){
				System.out.print(a[i][j] + "   ");
			}
			System.out.println();
		}
		System.out.println("The resultant 90 degree rotated matrix is :");
		for(int i = 0 ; i < c ; i++){
			for(int j = r-1 ; j >= 0 ; j--){
				System.out.print(a[j][i] + "   ");
			}
			System.out.println();
		}
	}
}
