package miu.video;

public class MeeraFirstElementGZI {

	static int isMeera(int []a) {
		
		int sum=0;
		int inLoop=0;
		
		//The Magic here
		for(int i=0;i<a.length;i++) {
			if(a[i]>i) {
				return 0;
			}
			//otherwise
			inLoop=1;
			sum+=a[i];
		}
		
		
		if(sum==0 && inLoop==1) return 1;
		
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isMeera(new int [] {-4, 0, 1, 0, 2, 1}));
		System.out.println(isMeera(new int []{-8, 0, 0, 8, 0}));
		System.out.println(isMeera(new int []{-8, 0, 0, 2, 0}));
	}

}
