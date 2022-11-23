package interview;

import java.util.Scanner;

public class SumOfDigits {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number");
	int n=sc.nextInt();
	int rem,sum=0;
	while(n!=0){
		rem=n%10;
		if(rem%2==1)
		sum=sum+rem;
		n=n/10;
	}
	System.out.println("Sum:"+sum);
}
}
