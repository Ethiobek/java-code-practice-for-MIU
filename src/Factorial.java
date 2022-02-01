import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// Here we are going to search the factorial of the given number
		int number,factorial=1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		number=sc.nextInt();
		
		
		for(int i=1;i<=number;i++) {
			factorial=factorial*i;
		}
		System.out.println("Factorial of a number is "+factorial);

	}

}
