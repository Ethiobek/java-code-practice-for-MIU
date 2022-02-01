package miu.video;

public class MeeraNonTrival {

	static int isMeera(int n) {
		int count=0;
		for(int i=2;i<n;i++) {
			if(n%i==0)
				count++;
		}
		if(n%count==0) return 1;
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isMeera(6));
	}

}
