package miu.video;

public class Bunker {

	static int isBunkerArray(int []a) {
		int isBunker=0;
		int count;
		int nextNumber;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0 && i!=a.length-1) {// the number is odd, therefore it should be followed atleast by 1 prime number
				count=0;
				nextNumber=a[i+1];
				for(int j=1;j<a[i];j++) {
					if(nextNumber%j==0) count++;
				}
				if(count==2) {
					isBunker=1;
					break;
				}
				
			}
		}
		
		return isBunker;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isBunkerArray(new int[]{4, 9, 6, 15, 21}));
	}

}
