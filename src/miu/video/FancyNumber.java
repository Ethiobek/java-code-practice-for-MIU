package miu.video;

//prevFirst=firstNumber;
//fancyNumber=(3*firstNumber)+(2*prevFirst);	
//
//firstNumber=fancyNumber;
//secondNumber=firstNumber;


public class FancyNumber {

	static int isFancy(int n) {
		
		int firstNumber=1;
		int secondNumber=1;
		int fancyNumber=0;
		
		if(n==1) return 1;
		
		for(int i=1;i<=n;i++) {	
			if(fancyNumber==n) return 1;
			
			fancyNumber=(3*firstNumber)+(2*secondNumber);	
			secondNumber=firstNumber;
			firstNumber=fancyNumber;	
			
		}
		return 0;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isFancy(1));
		
	}

}
