

public class LargestNumber {
	
	public static int returnLargest(int []nums) {
		int max=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				max=nums[i];
			}
		}
		
		return max;
	}
	
	
	public static void main(String[] args) {
		System.out.println(returnLargest(new int[] {1,4,100,85,1,99,50}));	
	}
}
