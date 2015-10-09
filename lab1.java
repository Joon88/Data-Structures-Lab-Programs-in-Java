import java.util.*; 
class lab1 {
	public static void main(String args[]){
		int c;
		Scanner scan = new Scanner(System.in);
		lab11 obj1 = new lab11();
		lab12 obj = new lab12();
		lab13 obj2 = new lab13();
		while(true){
			System.out.println("MENU");
			System.out.println("====");
			System.out.println("1.Insert");
			System.out.println("2.Arrange array elements");
			System.out.println("3.Array Reversal");
			System.out.println("4.Repeating array elements");
			System.out.println("5.Frequency count");
			System.out.println("6.Binary Search");
			System.out.println("7.Exit");
			System.out.println("Please enter your choice:");
			c = scan.nextInt();
			
			if(c==1){
				obj.insert();
			}else if(c==2){
				obj1.arrange(obj);
			}else if(c==3){
				reverse(obj);
			}else if(c==4){
				check_repeat(obj);
			}else if(c==5){
				freq_count(obj);
			}else if(c==6){
				int key;
				System.out.println("Please enter the number to be searched:");
				key = scan.nextInt();
				obj2.search(obj,key);
			}else if(c==7){
				return;
			}
		}
	}
	public static void reverse(lab12 object){
		for(int i = object.n-1 ; i >= 0 ; i--){
			System.out.println(object.arr[i] + " ");
		}
		System.out.println();
	}
	public static void check_repeat(lab12 object){
		int ctr = 0;
		for(int i = 0 ; i < object.arr.length ; i++){
			ctr=0;
			for(int j = 0 ; j < object.arr.length ; j++){
				if(object.arr[i] == object.arr[j]){
					ctr++;
				}
			}
			if(ctr > 1){
				System.out.println("The number "+ object.arr[i] + " is repeated " + ctr + " times");
			}
			else
				System.out.println("The number "+ object.arr[i] +" appears only once and is not repeated");
		}
		System.out.println();
	}
	public static void freq_count(lab12 object){
		check_repeat(object);
	}
}


class lab11 {
	
	public int temp = 0;
	public int a;
	public int[] arr1;
	public void sort(){
		for(int i = 0 ; i < a ; i++){
			temp = 0;
			for(int j = 0 ; j < a-1-i ; j++){
				if(arr1[j] > arr1[j+1]){
					arr1[j] = arr1[j] + arr1[j+1];
					arr1[j+1] = arr1[j] - arr1[j+1];
					arr1[j] = arr1[j] - arr1[j+1];
					temp++;
				}
			}
			if(temp == 0)
				break;
		}
	}
	public void arrange(lab12 object){
		a = object.n;
		arr1 = object.arr;
		sort();
		System.out.println("After arranging:");
		for(int i = 0 ; i < a ; i++){
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
	}
}



class lab12 {
	public int n;
	public int arr[];
	Scanner scan = new Scanner(System.in);
	public void insert(){
		System.out.println("Enter the number of elements to be entered:");
		n = scan.nextInt();
		arr = new int[n];
		System.out.println("Please enter:");
		for(int i=0;i<n;i++){
			arr[i] = scan.nextInt();
		}
		System.out.println("Thanks....");
		
	}
}



class lab13 {
	private int a, arr1[];
	public void search(lab12 object, int key){
		a = object.n;
		arr1 = object.arr;
		String rslt = binary_search(object,a, arr1,key);
		System.out.println(rslt);
	}
	public String binary_search(lab12 object, int n, int arr1[],int key){
		lab11 obj4 = new lab11();
		obj4.arrange(object);
		System.out.println("For binary search a sorted array is utmost!!!");
		int beg = 0, end = n-1;
		int mid = (beg+end)/2;
		while(arr1[mid] != key && beg < end){
			if(arr1[mid] > key)
				end = mid-1;
			else if(arr1[mid] < key)
				beg = mid+1;
			mid = (beg+end)/2;
		}
		if(arr1[mid] == key)
			return "Found";
		else 
			return "Not Found";
	}
}

