package miu.video;

public class Fibonaci {

	static int isFibonaci(int n) {
		
		int firstNumber=0,secondNumber=1,result;
		
		int found=0;
		
		while(n>=1) {
			
			result=firstNumber+secondNumber;	
			if(result==n) {
				found=1;
				break;
			}
			firstNumber=secondNumber;
			secondNumber=result;
			n--;	
		}
		return found;
	}
	
	public static void main(String[] args) {
		System.out.println(isFibonaci(4));
	}

}
