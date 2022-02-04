package miu.video;

public class DualEven {

	static int isDual(int []a) {
		
		
		if(a.length==0)   return 1;
		if(a.length%2!=0) return 0;
	
		int found=0,sum=0,prevSum=0;
		sum=a[0]+a[1];
	
		for(int i=0;i<a.length;i=i+2) {
			if(sum!=a[i]+a[i+1]) return 0;
			
		}
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isDual(new int []  {4,5,9,0}));
	}

}
