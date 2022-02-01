package miu.video;

public class BeanArray3 {

	static int isBeanArray(int []a) {
		int bean=1;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]==2*a[j] || a[i]==(2*a[j])+1 || a[i]==a[j]/2) return 1;
				else {
					bean=0;
				}			
			}
			if(bean==0) return 0;
		}
		return 0;
	}
	
	public static void main(String[] args) {	
		System.out.println(isBeanArray(new int []  {3, 8, 4} ));
	}

}
