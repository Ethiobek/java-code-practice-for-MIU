package miu.video;

public class DeleteDuplicate {

	static int []deleteDup(int []arr){
		
		int [] newArr=new int[arr.length];
		int newLen=0;
		boolean isDuplicate;
		
		for(int i=0;i<arr.length;i++) {
			isDuplicate=false;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==newArr[j]) {
					isDuplicate=true;
					break;
				}
			}
			if(isDuplicate==false) {
			newArr[newLen]=arr[i];
			newLen++;
			}
		}
		int []retArr= new int[newLen];
		for(int i=0;i<retArr.length;i++) {
			retArr[i]=newArr[i];
		}
		return retArr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []retArr=deleteDup(new int[] {1,2,9,1,4,5,2,9,9});
		for(int i=0;i<retArr.length;i++) {
			System.out.println(retArr[i]);
		}

	}

}
