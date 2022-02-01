
public class UpCount {

	public static int nUpCount(int[]a,int n) {
		
		if(a.length==0) return 0;
		int upCount=0,partialSum=0,previousPartialSum;
		for(int i=0;i<a.length;i++) {
			previousPartialSum=partialSum;
			partialSum+=a[i];
			if(partialSum>n && n>=previousPartialSum ) upCount++;
		}
		
		return upCount;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nUpCount(new int[] {2,3,1,-6,8,-3,-1,2}, 5));
		System.out.println(nUpCount(new int[] {6,3,1}, 5));
		System.out.println(nUpCount(new int[] {1,2,-1,5,3,2,-3}, 20));
	}

}
