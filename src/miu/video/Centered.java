package miu.video;

public class Centered {

	static int isCentered(int []a) {
		if(a==null) return 0;
		if(a.length%2==0) return 0;
		
		int midIndex=a.length/2;
		int found=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<=a[midIndex] && i!=midIndex) return 0;
		}
		
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isCentered(new int []    {3, 2, 1, 1, 4, 6}));
	}

}
