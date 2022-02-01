package miu.video;

public class WaveArray {

	static int isWaveArray(int []arr) {
		int wave=1;
		if(arr[0]%2==0) {
			for(int i=1;i<arr.length;i+=2) {
				if(arr[i]%2==0) {
					wave=0;
					break;
				}
			}
		}
		if(arr[0]%2!=0) {
			for(int i=1;i<arr.length;i+=2) {
				if(arr[i]%2!=0) {
					wave=0;
					break;
				}
			}
		}
		
		return wave;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isWaveArray(new int[]{2, 6, 3, 4}));
		System.out.println(isWaveArray(new int[]{1, 6, 5}));
	
	}

}
