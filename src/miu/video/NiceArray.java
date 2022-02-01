package miu.video;

public class NiceArray {

	static int isNiceArray(int []a) {
		int nice=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				nice=0;
				if(a[i]==a[j]+1 || a[i]==a[j]-1) {
					nice =1;
					break;
				}
			}
		}
		return nice;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isNiceArray(new int[] {2, 10, 9, 3} ));
		System.out.println(isNiceArray(new int[]  {2, 2, 3, 3, 3} ));
		System.out.println(isNiceArray(new int[]  {1, 1, 1, 2, 1, 1}  ));
		System.out.println(isNiceArray(new int[]   {0, -1, 1}  ));
		System.out.println(isNiceArray(new int [] {3, 4, 5, 7} ));
		System.out.println(isNiceArray(new int []{0, -1, 1}));
	}

}
