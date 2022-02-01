package miu.video;

public class SmartNumber {
	static int isSmart(int n) {
		int smart=0;
		int k=2,smartSum=0;
		for(int i=1;i<=n;i++) {
			smartSum=k-(i);
			if(n==smartSum) {
				smart=1;
				break;
			}
			k=k+i;
			smartSum=0;
		}
		return smart;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSmart(8));

	}

}
