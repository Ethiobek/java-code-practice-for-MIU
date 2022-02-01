package miu.video;

public class BeanArray {

	static int isBeanArray(int []arr) {
		int bean=1;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==9) {
					if(arr[j]!=13) {
						bean=0;
					}
				}
				if(arr[i]==7) {
					if(arr[j]==16) {
						bean=0;
					}
				}
			}
		}
		return bean;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isBeanArray(new int [] {4, 4,8}));
	}

}
