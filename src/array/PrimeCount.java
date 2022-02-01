package array;

public class PrimeCount {

	public static int primeCount(int start, int end) {
		boolean isPrime=true;
		int count,primeCount=0;
		
		//first loop : trace thr...start to end
		
		for(int i=start;i<=end;i++) {
			count=0;
			//the next loop is to check if the number is prime
			for(int j=i;j>=1;j--) {
				// i%j==0
				if(i%j==0) count++;
			}
			if(count==2) primeCount++;
		}
		
		return primeCount;
	}

	public static int isMadhavArray(int[] a) {
		int n=a.length;
		int isMadhav=1;
		int arraySum=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<j+1;j++) {
				arraySum = a[i+1]+a[j];
				if(arraySum!=a[0]) {
					isMadhav=0;
					break;
				}
			}
		}
		
		return isMadhav;
	}
	
	public static void main(String[] args) {
	
//		System.out.println(primeCount(10, 30));
//		System.out.println(primeCount(11, 29));
//		System.out.println(primeCount(20, 22));
//		System.out.println(primeCount(1, 1));
//		System.out.println(primeCount(5, 5));
//		System.out.println(primeCount(6, 2));
//		System.out.println(primeCount(-10, 6));
		/*
		 * {6, 2, 4, 2, 2, 2, 1, 5, 0, 0}
		 * {18, 9, 10, 6, 6, 6}
		 * */
		System.out.println(isMadhavArray(new int[]{2, 1, 1, 4, -1, -1}));
		System.out.println(isMadhavArray(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0}));
		System.out.println(isMadhavArray(new int[]{18, 9, 10, 6, 6, 6}));

	}

}
