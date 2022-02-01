package miu.video;

public class KSmallFactor {

	static boolean isKFactor(int k,int n) {	
		// first step, find factor of n
		int factor;
		int otherFactor=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				otherFactor=n/i;
			}
			if(otherFactor<k && i<k) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(isKFactor(6, 30));
	}
}
