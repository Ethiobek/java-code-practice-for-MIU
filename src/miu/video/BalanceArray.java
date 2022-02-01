package miu.video;

public class BalanceArray {

	static int isBalanced(int []arr){
		boolean isEven=true,isOdd=true;
		for(int i=0;i<arr.length;i+=2) {
			if(arr[i]%2!=0) {
				isEven=false;
				break;
			}
		}
		for(int j=1;j<arr.length;j+=2) {
			if(arr[j]%2==0) {
				isOdd=false;
				break;
			}
		}
		if(isOdd&&isEven) return 1;
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isBalanced(new int[] {2, 3, 6, 7}));
		System.out.println(isBalanced(new int[] {7, 15, 2, 3}));
		System.out.println(isBalanced(new int [] {16, 6, 2, 3}));
	}

}
