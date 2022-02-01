package miu.video;

public class MeeraPrimeZero {
	static boolean isPrime(int n) {
		boolean prime=true;
		if(n<=1) prime=false;
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				prime=false;
				break;
			}
		}
		return prime;
	}
		
	static int isMeera(int a[]) {
		int meera=9;
	
		for(int i=0;i<a.length;i++) {
			if(isPrime(a[i])) {
				for(int j=0;j<a.length;j++) {
					if(a[j]==0) {
						meera=1;
						break;
					}
					else {
						meera=0;
					}
				}
				if(meera==0) return 0;
			}
			if(!isPrime(a[i])&& a[i]!=0) meera=1;
		}
		return meera;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isMeera(new int []  {6, 10, 1}));
		System.out.println(isPrime(7));
	}

}
