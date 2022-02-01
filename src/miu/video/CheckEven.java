package miu.video;

public class CheckEven {
	
	static int isEvens(int n) {
		int evens=1;
		int lastDigit=0;
		while(n!=0) {
			lastDigit=n%10;
			if(lastDigit%2!=0) {
				evens=0;
				break;
			}
			n=n/10;
		}
		return evens;
	}
	public static void main(String []args) {
		System.out.println(isEvens(3224));
		System.out.println(isEvens(8628));
	}
}
