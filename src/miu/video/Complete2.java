package miu.video;

public class Complete2 {

	static int isComplete(int []a) {
		int complete=1;
		int max=Integer.MIN_VALUE;
		
		//First check  if every element in the array is greater than zero
		for(int i=0;i<a.length;i++) {
			if(a[i]<=0) break;
			if(a[i]%2==0 && a[i]>max) max=a[i];
		}
		
		//check the existance of even numbers lessthan the max even
		for(int j=0;j<a.length;j++) {
			if(max!=a[j]) {
				complete=0;
			}
			if(max==a[j]){
				max=max-2;
				complete=1;
			}		
		}
		return complete;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isComplete(new int []  {2, -3, 4, 3, 6}));
	}

}
