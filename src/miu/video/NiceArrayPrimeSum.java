package miu.video;

public class NiceArrayPrimeSum {

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
	
	static int  isNiceArray(int []a) {
		int primeSum=0;
		int primeFound=0;
		
		for(int i=0;i<a.length;i++) {
			if(isPrime(a[i])) {
				primeSum+=a[i];
				primeFound=1;
			}
		}
		if(primeFound==0 && a[0]==0) return 1;
		
		if(primeFound==1 && a[0]==primeSum) return 1;
		
		return 0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(isNiceArray(new int []));
		System.out.println(isNiceArray(new int [] {0, 6, 8, 20}));
		System.out.println(isNiceArray(new int [] {8, 5, -5, 5, 3}));
	}

}
