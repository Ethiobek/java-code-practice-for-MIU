import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		//Prime number is a number that is divisible only by one and itself		
		Scanner sc;
		int num,count=0;
		sc=new Scanner(System.in);
		
		System.out.println("What number you want to check it is prime?");
		num = sc.nextInt();
		
		if(num==1) System.out.println("One is neither prime nor composite");
		else if(num>1) {
				for(int i=1;i<=num;i++) {
					if(num%i==0) {
						count++;
					}
				}
				if(count>2) {
					System.out.println("The number is not prime ");
				}
				else {
					System.out.println("The number is prime ");
				}
			}
		}

	}