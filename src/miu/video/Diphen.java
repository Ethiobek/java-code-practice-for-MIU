package miu.video;

public class Diphen {

	static  int isDaphne (int[ ] a){
        int status = 0;
        int begin = 0;
        int end = a.length -1;
        int diphane = 0;
        int count=0;
        
        for(int i=0; i<a.length; i++){
            if(a[i] % 2 != 0){
                status = 1;
                break;
            }
        }
        
        if(status == 1){
             for(int i=0;i<a.length;i++, end--){
                 if(a[i] % 2 == 0 && a[end] % 2 == 0){
                     diphane = 1;
                     count++;
                 }
             }
             
           
        }
        if(diphane==0 && count!=0) return 1;
        return 0;
    
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isDaphne(new int []  {4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6} ));
	}

}
