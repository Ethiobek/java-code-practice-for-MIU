package miu.video;

public class repsEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(repEqual2(new int[] {5,8,6,9},5869));
	}
	
	static int repsEqual(int []number,int digit) {
		int retVal=1,output=0,reminder;
		for(int i=number.length-1;i>=0;i--) {
			if(digit!=0){
				if(number[i]!=digit%10) {
					retVal=0;
					break;
				}
				digit=digit/10;
			}
		}
		
		return retVal;
	}
	
	static int repEqual2(int[] a, int num){
        int arrToNum = 0;
        for (int i = 0; i < a.length; i++) {
            arrToNum = arrToNum * 10 + a[i];
        }
        if(arrToNum == num) return 1;
        return 0;
}
}
