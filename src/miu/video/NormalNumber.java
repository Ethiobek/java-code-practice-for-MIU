package miu.video;

public class NormalNumber {

	static int isNormal(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0 && i%2!=0) return 0;
		}
		return 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isNormal(6));
	}

}
