package interview;

public class PrimeNumbersInRange {
	public static int prime(int n){
		for(int i=2;i<n;i++){
			if(n%i==0){
				return -1;
			}
		}
		return 1;
	}
public static void main(String[] args) {
	int sum=0;
	for(int i=120;i<=150;i++){
		if(prime(i)==1){
			sum=sum+i;
			System.out.println(i);
		}
	}
	System.out.println("---------");
	System.out.println("sum:"+sum);
}
}
