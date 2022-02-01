package miu.video;

public class Hollow {

	static int isHollow(int []givenArray) {
		if(givenArray.length<5) return 0;
		
		int leftNonZero=0;
		int rightNonZero=0;
		int zeros=0;// at least 3 or more and [ leftNonZero==rightNonZero ]
		
		int halfArray;
		if(givenArray.length%2==0) halfArray= (givenArray.length/2);
		else halfArray=givenArray.length/2;
		
		// Now travers through the array
		for(int i=halfArray;i>=0;i--) {
			if(givenArray[i]==0) {
				zeros++;
			}
			else {
				leftNonZero++;
				
			}
		}
		for(int i=halfArray+1;i<givenArray.length;i++) {
			if(givenArray[i]==0) {
				zeros++;
			}
			else {
				rightNonZero++;		
			}
		}
		if(zeros>=3 && (leftNonZero==rightNonZero)) return 1;
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		System.out.println(isHollow(new int[] {1,2,8,9,0,0,0,0,0,3,4,5}));
	}

}
