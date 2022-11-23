package interview;

import java.util.Scanner;

public class StrongNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number");
	int n1=sc.nextInt();
	int n2=n1;
	int rem,sum=0;
	while(n1!=0){
		rem=n1%10;
		int ans=1;
		for(int i=1;i<=rem;i++){
			ans=ans*i;
		}
		sum=sum+ans;
		n1=n1/10;
	}
	if(n2==sum){
		System.out.println("Strong Number");
	}
	else{
		System.out.println("Not a Strong Number");
	}
}
}
