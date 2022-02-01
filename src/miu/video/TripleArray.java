package miu.video;

public class TripleArray {

	static int isTrippleArray(int []a) {
		int countNumber;
		
		for(int i=0;i<a.length;i++) {
			countNumber=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j])
					countNumber++;
			}
			if(countNumber!=3) return 0;
		}
		
		
		return 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isTrippleArray(new int []{3, 1, 2, 1, 3, 1, 3, 2, 2}));
		System.out.println(isTrippleArray(new int []{2, 5, 2, 5, 5, 2, 5}));
		System.out.println(isTrippleArray(new int []{3,1, 1, 1}));
		
	}

}
