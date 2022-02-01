package miu.video;

public class IsDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isDivisble(new int[] {3,3,6,36}, 3));
		System.out.println(isDivisble(new int[] {4},2 ));
		System.out.println(isDivisble(new int[] {3,4,3,6,36},3 ));
		System.out.println(isDivisble(new int[] {6,12,24,36},12 ));
		System.out.println(isDivisble(new int[] {}, 12));
	}
	
	static int isDivisble(int[]givenArray,int divisor) {
		if(givenArray==null || givenArray.length==0) return 1;
		if(divisor==0) return 0;
		
		int isDivisible =1;
		//now check every element in the array
		for(int i=0;i<givenArray.length;i++) {
			if(givenArray[i]%divisor!=0) {
				isDivisible=0;
				break;
			}
		}
		return isDivisible;
	}
}
