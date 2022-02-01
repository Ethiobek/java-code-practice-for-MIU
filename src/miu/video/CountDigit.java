package miu.video;

public class CountDigit {

	static int countDigit(int n,int digit) {
		int count=0;
		int digitInN;
		while(n!=0) {
			digitInN=n%10;
			if(digitInN==digit)count++;
			n=n/10;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countDigit(44158546, 4));
	}

}
