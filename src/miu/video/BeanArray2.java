package miu.video;

public class BeanArray2 {
	static int isBeanArray(int []a) {
		int bean=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]+1 || a[i]==a[j]-1) {
					bean=1;
					break;
				}
				else bean=0;
			}
			if(bean==0)  return 0;
		}
		
	
		return bean;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isBeanArray(new int []  {3, 4, 5, 7}));
	}
}
