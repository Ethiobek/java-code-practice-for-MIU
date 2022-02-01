// nextPerfectSquare()

public class PerfectSq {
	
	public static int isPerfectSquare(int n) {
		
		int max = Integer.MAX_VALUE;
		
		int val=0;
		if(n<0) {
			return 0;
		}
		for(int i=n+1;i<max;i++) {
			// find the multiple of the next number
			for(int j=i;j>0;j--) {
				if(i%j==0 && j*j==i) {
					return i;
				}
			}
		}
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPerfectSquare(6));
	}

}
