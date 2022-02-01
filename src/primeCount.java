
public class primeCount {

	public static int isMadhavArray(int[]a,int len) {

		for(int i=0;i<a.length;i++) {
			int tempSum=a[i];
			for(int j=0;j<i;j++) {
				if(tempSum==a[i]+a[j]) {
					return 1;
				}
			}
		}
		
		
		return 0;
	}
	
	public static int primeCount(int start,int end) {
		int cn=0,count=0,primeCount=0;
		for(int i=start;i<=end;i++) {
			cn=i;
			count=0;
			for(int j=1;j<=cn;j++) {
				if(cn%j==0) {
					count++;
				}
			}
			if(count==2) {
				primeCount++;
			}
			
		}
		return primeCount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(primeCount(10, 30));
//		System.out.println(primeCount(11, 29));
//		System.out.println(primeCount(20,22));
//		System.out.println(primeCount(1,1));
//		System.out.println(primeCount(5,5));
//		System.out.println(primeCount(6,2));
//		System.out.println(primeCount(-10,6));
		System.out.println(isMadhavArray(new int[] {2,1,1},3));
		
	}

}
