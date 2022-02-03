package miu.video;

public class DualArray {

	static int isDualArray(int a[]) {
		int count;
		for(int i=0;i<a.length;i++) {
			
			count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}		
			if(count!=2) return 0;
		}
		return 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isDualArray(new int []{3, 3, 1, 2, 2} ));
	}

}
