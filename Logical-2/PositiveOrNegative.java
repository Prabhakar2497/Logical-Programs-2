package interview;

import java.util.Scanner;

public class PositiveOrNegative {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int a=sc.nextInt();
		if(a>0){
		System.out.println("Positive Number");	
		}
		else if(a<0){
			System.out.println("Negative Number");
		}
		else{
			System.out.println("Number is Zero");
		}
	}
 
}
