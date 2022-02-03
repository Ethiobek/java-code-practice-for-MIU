package miu.video;

public class FilterArray {
	
	static int isFilter(int []a) {
		int found=1;
		boolean fCond=true,sCond=true;
		
		for(int i=0;i<a.length;i++) {
			
			// Search for 9
			if(a[i]==9) {
				//search for 11
				for(int j=0;j<a.length;j++) {
					if(a[j]==11) {
						found=1;
						fCond=true;
						break;
					}
					else {
						found=0;
						fCond=false;
					}
				}
				if(found==0) fCond=false;
			}
			if(a[i]==7) {
				// check if 13 is not exist
				for(int j=0;j<a.length;j++) {
					if(a[j]==13) {
						found=0;
						sCond=false;
						break;
					}
					else {
						sCond=true;
						found=1;
					}
				}
				if(found==0) sCond=false;
			}

		}
		if(fCond && sCond) return 1;
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isFilter(new int [] {1,4,5,9,4,8,7}));
	}

}
