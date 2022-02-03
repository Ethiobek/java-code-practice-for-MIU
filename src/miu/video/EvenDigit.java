package miu.video;

public class EvenDigit {

	static int isEven(int n) {

		int ques = 0;
		int rem = 0;

		while (n != 0) {
			rem = n % 10;
			if (rem % 2 != 0)
				return 0;
			n = n / 10;
		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isEven(2486));

	}

}
