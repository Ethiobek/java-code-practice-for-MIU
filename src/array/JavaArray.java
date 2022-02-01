package array;

public class JavaArray{
	
	// We can create method here
	public static int sum(int a,int b) {
		return a+b;
	}
	
	public static void fullSqr() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void triangle() {
		int val=1;
		
		for(int i=0;i<3;i++) {
			for(int j=3;j>i;j--) {
				System.out.print(" ");
			}
			for(int x=0;x<val;x++) {
				System.out.print("*");
			}
			val+=2;
			System.out.println();
		}
	}
	
	// IS CENTERED
	public static int isCentered(int []number) {
		
		
		if(number.length%2==0 || number==null) return 0;
		int mid=(number.length/2);
		for(int i=0;i<number.length;i++) {
			
			if(i!=mid && number[mid]>=number[i]) return 0;
			
		}
		
		return 1;
	}
	
	public static int f(int[] a) {
		int sumOdd=0,sumEven=0,result;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				//even addition
				sumEven+=a[i];
			}
			else {
				//odd addtion
				sumOdd+=a[i];
			}
			
		}
		result=sumOdd-sumEven;
		
		return result;
	}
	
	
	public static void main(String []args) {
//		triangle();
		
	
//		System.out.println("---------------");
//		System.out.println(isCentered(new int[]{1, 2, 3, 4, 5}));
//		System.out.println(isCentered(new int[]{3, 2, 1, 4, 5}));
//		System.out.println(isCentered(new int[]{3, 2, 1, 4, 1}));
//		System.out.println(isCentered(new int[]{1, 2, 3, 4}));
		
		System.out.println(f(new int []{1}));
		System.out.println(f(new int []{1,2}));
		System.out.println(f(new int []{1,2,3}));
		
	}
	/*
	 *       *
	 * 		***
	 * 	   *****
	 * 
	 * */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}