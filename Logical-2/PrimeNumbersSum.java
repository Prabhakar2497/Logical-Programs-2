package interview;

public class PrimeNumbersSum {
public static void main(String[] args) {
	int n=123456789;
	int rem,sum=0;
	while(n!=0){
		rem=n%10;
		if(rem%2==0||rem%2==1){
			if(rem==2||rem==3||rem==5||rem==7){
				sum=sum+rem;
			}
			n=n/10;
		}
	}
	System.out.println(sum);
}
}
