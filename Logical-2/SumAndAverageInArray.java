package interview;

import java.util.Scanner;

public class SumAndAverageInArray {
public static void main(String[] args) {
	  int sum=0;
	  int arr[]={1,2,3,4,5,6,7,8,9};
	  for(int i=0;i<arr.length;i++){
		  sum=sum+arr[i];
	  }
	System.out.println("Sum:"+sum+"\tAverage:"+sum/arr.length);
}
}
