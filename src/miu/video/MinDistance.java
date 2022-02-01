package miu.video;

public class MinDistance {

	public static int minDistance(int n){
        int fact1 = 1;
        int minDistance = n;
        int fact2 = 0;
        
        for(int i=2; i<n; i++){
            if (n%i==0){
            fact2 = i;
                if((fact2-fact1)<=minDistance){
                    minDistance = fact2-fact1;
                    fact1 = fact2;                   
                }           
            }
        }
    return minDistance;
}   
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(minDistance(13013));
}

}
