package miu.video;

public class CompleteArray {

	static int isComplete(int []a) {
		int complete=0;
		int found;
		int counter=0;
		int maxEven = Integer.MIN_VALUE;
		int minEven = Integer.MAX_VALUE;
		int minIndex=0,maxIndex=0;
		int bn=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0 && a[i]>maxEven) {
				maxEven=a[i];
				maxIndex=i;
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0 && a[i]<minEven) {
				minEven=a[i];
				minIndex=i;
			}
		}
		bn=maxEven-minEven-1;
		//If the numbers are have no maxEven means, there is no even number in the array
		if(maxEven<0 ) return 0;
		
		//No check if the numbers in the range are found in the array

		for(int i=minEven+1;i<maxEven;i++) {
			found=0;
			for(int j=0;j<a.length;j++) {
				if(i==a[j]) {
					found=1;
					break;
				}//end if				
			}//end nested for			
			if(found==1) {
				counter++;
			}
		}
		if(counter==bn) complete=1;
		
		return complete;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println(isComplete(new int[] {-5, 6, 2, 3, 2 , 4, 5, 11, 8,9,10, 7}));
		System.out.println(isComplete(new int[]{5, 7,9, 13}));
		System.out.println(isComplete(new int[]{2, 2}));
		System.out.println(isComplete(new int[]{2, 6,3,5,4}));
	}

}
