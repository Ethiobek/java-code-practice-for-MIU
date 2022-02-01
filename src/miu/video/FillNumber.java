package miu.video;

public class FillNumber {

	static int[] fill(int[] arr, int k, int n) {
		if(n<1 || k<1) return null;
		int []arr2 =new int[n];
		int startIndex=0;
			for(int j=0;j<n;j++) {
				arr2[j]=arr[startIndex];
				if(k==1) startIndex=0;
				else {
					startIndex++;
				}
				if(startIndex==k && j>0)
					startIndex=0;
			}
		return arr2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []result= fill(new int[]{4, 2, -3, 12}, 3, 5);
		if(result==null) System.out.println("null");

		else {
			System.out.print("{");
			for(int i=0;i<result.length;i++) {
				System.out.print(result[i]+",");
			}
			System.out.println("}");
		}
	}

}
