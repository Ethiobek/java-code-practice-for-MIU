package miu.video;

public class TwinPrime {
	
	static boolean isPrime(int n) {
		boolean prime=true;
		if(n<2) return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				prime=false;
				break;
			}
		}
		return prime;
	}

	static int isTwin(int []a) {
		int isTwin=0;
		int k=-1,k2=-1,found=-1;
		for(int i=0;i<a.length;i++) {
			k=-1;
			k2=-1;
			if(isPrime(a[i])) {
				if(isPrime(a[i]-2)|| isPrime(a[i]+2)) {
					if(isPrime(a[i]-2)) {
						k=a[i]-2;
					}
					if(isPrime(a[i]+2)) {
						k2=a[i]+2;
					}
					found=0;
					for(int j=0;j<a.length;j++) {
						if((k==a[j] && k!=-1)||(k2==a[j] && k2!=-1)) {
							isTwin=1;
							found=1;
						}
					}
				}
			}
			if(found==0) break;
			
		}
		return isTwin;
	}
	
	
	public static void main(String[] args) {
		System.out.println(isTwin(new int []{3, 5, 8, 10, 27}));
		System.out.println(isTwin(new int []{11, 9, 12, 13, 23}));
		System.out.println(isTwin(new int[]{5, 3, 14, 7, 18, 67}));
		System.out.println(isTwin(new int[]{13, 14, 15, 3, 5} ));
		System.out.println(isTwin(new int[]{1, 17, 8, 25, 67}));	
	}

}




 