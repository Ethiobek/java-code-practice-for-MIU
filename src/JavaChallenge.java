import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaChallenge {

	//Finding the adjecent sum of numbers in the array
	public static int adjecentSum(int []a) {
		// Integer min value will return the minimum value that integer can hold
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]+a[i+1]>max) {
				max=a[i]+a[i+1];
			}
			
		}
		return max;
	}
	
	//Encoding the prime factors of the numbers
	public static int [] primeFactor(int num) {
		List<Integer> PrimeFactors = new ArrayList<>();
		for(int i=2;i<num;i++) {
			while(num%i==0) {
				PrimeFactors.add(i);
				num = num/i;
			}
		}
		
		// here I have to change the data type
		int [] ArrayToReturn = new int[PrimeFactors.size()];
		for(int i=0;i<PrimeFactors.size();i++) {
			ArrayToReturn[i]=PrimeFactors.get(i);
		}
		if(num>1)  PrimeFactors.add(num);
		return ArrayToReturn;
	}

	
	
    public static void main(String[] args) {
    	//    	System.out.println(adjecentSum(new int[]{9,2,3}));
    	//   	System.out.println(Arrays.toString(primeFactor(100)));
    	
    }
}