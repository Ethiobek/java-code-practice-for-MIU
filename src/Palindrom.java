import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a,b;
		StringBuffer sb;
		Scanner cin=new Scanner(System.in);
		
		System.out.println("Enter any word");
		a=cin.nextLine();
		
		//Now check if the number is the same when it is reveresed
		
		sb= new StringBuffer(a);
		b=sb.reverse().toString();
		if(b.equals(a)) {
			System.out.println(a+" is palindrom! ");
		}
		else
			System.out.println("The word is not palindrom!");
		

	}

}
