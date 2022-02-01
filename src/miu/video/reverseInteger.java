package miu.video;

public class reverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sampleData  = 1234;
		
		System.out.println(returnReverse(-1234));
	}

	
	public static int returnReverse(int givenNumber) {
		int output=0;
		int sign=1;
		if(givenNumber ==0) return 0;
		if(givenNumber<0) {
			sign=-1;
			givenNumber = sign*givenNumber;
		}
	
		while(givenNumber!=0) {
			output=(output*10)+(givenNumber%10);
			givenNumber=givenNumber/10;
		}
		
		return sign*output;
	}
}
