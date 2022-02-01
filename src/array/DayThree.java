package array;

import java.util.ArrayList;

public class DayThree {

	public static char[] f(char[] a, int start, int len) {
		char[] chr = new char[len];
		if (a.length < len)
			return null;
		for (int i = start, j = 0; j < len; i++, j++) {
			chr[j] = a[i];
		}
		return chr;
	}

	static char[] a3(char[] a, int start, int length) {
		if (length < 0 || start < 0 || start + length - 1 >= a.length) {
			return null;
		}

		char[] sub = new char[length];
		for (int i = start, j = 0; j < length; i++, j++) {
			sub[j] = a[i];
		}

		return sub;
	}

	static int f(int[] a) {
		if (a.length < 3)
			return -1;
		int i = 0;
		int j = a.length - 1;
		int idx = 1;
		int leftSum = a[i];
		int rightSum = a[j];
		for (int k = 1; k < a.length - 2; k++) {
			if (leftSum < rightSum) {
				i++;
				leftSum += a[i];
				idx = i + 1;
			} else {
				j--;
				rightSum += a[j];
				idx = j - 1;
			}
		}
		if (leftSum == rightSum)
			return idx;
		else
			return -1;
	}

	static int[] commonArray(int[] first, int[] second) {
		int arrayLen=0;
		int newArrayLen=0, secLen=0;
		int [] cmArray=new int[newArrayLen];
		if(first==null || second==null) return null;
		int lenOfArray1=first.length, lenOfArrayTwo=second.length;
		if(lenOfArray1>lenOfArrayTwo) {arrayLen=lenOfArray1;secLen=lenOfArrayTwo;}
		else {arrayLen=lenOfArrayTwo; secLen=lenOfArray1;};
		
		for(int i=0;i<arrayLen;i++) {
			for(int j=0;j<secLen;j++) {
				if(first[i]==second[j]) {
					cmArray[i]=first[i];
					newArrayLen++;
					break;
				}
			}
		}
	
		
		return cmArray;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
