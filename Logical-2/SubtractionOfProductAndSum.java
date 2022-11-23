package interview;

import java.util.Scanner;

public class SubtractionOfProductAndSum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The 4 Digit Number");
	int n=sc.nextInt();
	int rem,sum=0;
	int ans=0;
	int product=1;
	while(n!=0){
		rem=n%10;
		product=product*rem;
		sum=sum+rem;
		n=n/10;
		ans=product-sum;
	}
	System.out.println(ans);
}
}
