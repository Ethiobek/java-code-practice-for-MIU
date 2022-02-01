package miu.video;

public class EqualSet {

	  static int isEqualSet(int []a,int []b) {
	    int isEqual=0;
	    boolean eq1=false,eq2=false;
	    // int eq1=1,eq2=1;
	    
	    for(int i=0;i<a.length;i++) {
	      for(int j=0;j<b.length;j++) {
	        if(a[i]==b[j]) {
	          eq1 = true;
	          break;
	        }else {
	            eq1 = false;
	        }
	        
	      }
	      
	      
	        if (!eq1) {
	            break;
	        }
	    }
	    
	    for (int i=0; i<b.length; i++){
	        for (int j=0; j<a.length; j++){
	            if(a[j] == b[i]){
	                eq2 = true;
	                break;
	            }else {
	                eq2 = false;
	            }
	        }
	        
	        if (!eq2) {
	            break;
	        }
	    }
	    
	    if(eq1 && eq2) isEqual=1;
	    return isEqual;
	  }
	  
	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    System.out.println(isEqualSet(new int[] {1, 7, 9,4,9,8, 3}, new int[]  {1, 7, 8,9,9, 4,3, 1,9,8,4}));
	  
	  }

	}