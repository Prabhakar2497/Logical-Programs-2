package interview;

import java.util.Scanner;

public class StringUniqueInSentence {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The String");
	String s1=sc.nextLine();
	 String arr[]=s1.split(" ");
	 for(int i=0;i<arr.length;i++){
		 int flag=0;
		 for(int j=0;j<arr.length;j++){
			 if(i!=j&&arr[i].equals(arr[j])){
				 flag=1;
				 break;
			 }
		 }
		 if(flag==0){
			 System.out.print(arr[i]+" ");
		 }
	 }
}
}
