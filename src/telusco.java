/**
 * @author EMMRC
 *
 */
public class telusco {

	public static int isPrime(int n) {
		int val = 0;
		if (n % 2 == 0) {
			val = 1;
		}

		return val;

	}

	public static void checkNumber(int n) {
		int checkNumber = n;
		switch (checkNumber) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		default:
			System.out.println("Hahaha");
		}
	}

	public static void conditions() {

		for (int i = 1; i <= 5; i++) {
			System.out.println("* ");
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

		}

	}

	public static void patternStar(int n) {
		if (n == 6) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		} else if (n == 7) {
			for (int i = 1; i <= n; i++) {
				char letter = 65;

				for (int j = 1; j <= i; j++) {

					System.out.print(letter + " ");
					letter++;
				}
				letter++;
				System.out.println();
			}
		} else if (n == 10) {
			for (int i = 0; i <= n; i++) {
				for (int j = 0; j <= n; j++) {
					if (i == 0 || j == 0 || i == n || j == n) {
						System.out.print("$");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();

			}
		} else {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
		}
	}

	public static void printIf() {
		for (int i = 1; i <= 10; i++) {
			if (i == 7)
				continue;
			System.out.println("Number " + i);

		}
	}

	private void arrayExample() {

//		int numbers[] = new int[4];

		int numbers[] = { 1, 2, 3, 4 };

	}

	public static int largestPrimeFactor(int num) {
		
		if(num<=1) return 0;
		int number = num;
		while(number>1) {
			if(num%number==0) {
				boolean isPrime=true; 
				// the above code checks if the number is prime numebr
				for(int i=2;i<number;i++) {
					if(number%i==0) {
						isPrime=false;
						break;
					}
				}
				if(isPrime) return number;
			}
			number--;
		}
		return 0;
	}
	
	public static int is235Array(int [] arr) {
		int total =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) total+=1;
			if(arr[i]%3==0) total+=1;
			if(arr[i]%5==0) total+=1;
			if(arr[i]%2!=0&&arr[i]%3!=0&&arr[i]%5!=0) total+=1;
		}
		return total==arr.length?1:0;
	}
	
	public static void main(String args[]) {
		System.out.println(is235Array(new int[]{2,3,5,7,11}));
		
	}

}