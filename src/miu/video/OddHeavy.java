package miu.video;

public class OddHeavy {
	
	static int isOddHeavy(int []a) {
		int heavy=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				for(int j=0;j<a.length;j++) {
					if(a[j]%2==0 && a[i]<a[j]) {
						return 0;
					}
					else {
						heavy=1;
					}
				}
			}
		}
		return heavy;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isOddHeavy(new int [] {-2, -4, -6, -8, -11} ));
	}

}
