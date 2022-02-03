package miu.video;

public class Bunker3 {
	static int isBunker(int n) {
		int sum=1;
		if(n<0) return 0;
		for(int i=1;i<=n;i++) {
			if(sum==n) return 1;
			sum=i+sum;
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isBunker(22));
	}

}
