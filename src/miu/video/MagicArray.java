package miu.video;

public class MagicArray {
	static int isMagic(int [] a) {
		int magicArray=0;
		int firstElement=a[0];
		int sumOfPrime=0;
		int counter=0;
		for(int i=1;i<a.length;i++) {
			counter=0;
			for(int j=a[i];j>=1;j--) {
				if(a[i]%j==0) {
					counter++;
				}
			}	
			if(counter==2) {
				sumOfPrime+=a[i];
			}
		}
		if(sumOfPrime==firstElement) magicArray=1;
		
		return magicArray;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isMagic(new int [] {21, 3, 7, 9, 11, 4, 6}));
	}

}
