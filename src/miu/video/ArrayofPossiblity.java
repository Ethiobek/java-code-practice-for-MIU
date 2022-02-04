package miu.video;

public class ArrayofPossiblity {

	static int isAllPossiblity(int []a) {
		int n=a.length-1;
		int found=-1;
		
		for(int i=0;i<a.length;i++) {
			found=0;
			for(int j=0;j<=n;j++) {
				if(a[i]==j) {
					found=1;
					break;
				}
				else found=0;
			}
			if(found==0) return 0;
		}
		
		return 1;
	}
	public static void main(String[] args) {
		System.out.println(isAllPossiblity(new int [] {1,2,0,3,4}));
	}

}
