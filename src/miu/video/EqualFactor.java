package miu.video;

public class EqualFactor {

	static int isEqualFactor(int n,int m) {
		int countNFactor=0;
		int countMFactor=0;
		
		for(int i=1;i<n;i++) {
			if(n%i==0) countNFactor++;
		}
		for(int j=1;j<m;j++) {
			if(m%j==0) countMFactor++;
		}
		
		if(countMFactor==countNFactor) return 1;
		
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isEqualFactor(10, 33));
		System.out.println(isEqualFactor(9, 10));
	}

}
