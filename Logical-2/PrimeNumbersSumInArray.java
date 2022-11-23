package interview;

public class PrimeNumbersSumInArray {
	public static boolean prime(int n){
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}
		if(count==2){
			return true;
		}
		else{
			return false;
		}
	}

public static void main(String[] args) {
	int arr[]={1,2,3,4,5,6,7,8,9};
	int sum=0;
	for(int i=0;i<arr.length;i++){
	if(prime(arr[i])){
		System.out.print(arr[i]+" ");
		sum=sum+arr[i];
	}
	}
	System.out.println("Sum:"+sum);
}
}
