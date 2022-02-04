package miu.video;

public class IsSumDigit {
	static int isSum(int n) {
		int number=n;
		int rem=0;
		int sum=0;
		if(n<0) n=-1*n;
		while(n!=0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
			
		}
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSum(-6543));
	}

}
