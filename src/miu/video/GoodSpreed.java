package miu.video;

public class GoodSpreed {
	static int isGoodSpreed(int []a) {
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j])
					count++;
			}
			if(count>3) return 0;
		}
		
		return 1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isGoodSpreed(new int []{3, 1, 3 ,1, 3, 5, 5, 3} ));
	}

}
