package miu.video;

public class Mera {

	static int isMerra(int []a) {
		int merra=1;
		int check;
		
		for(int i=0;i<a.length;i++) {
			check=a[i]*2;
			for(int j=0;j<a.length;j++) {
				
				if(check==a[j]) {
					merra=0;
					break;
				}	
			}
			check=0;
		}
		return merra;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isMerra(new int[] {8, 3, 4}));
	}

	
}
