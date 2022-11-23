package interview;

public class SumOfDuplicatesInArray {
public static void main(String[] args) {
	int arr[]={10,20,30,10,40,30,50};
	int sum=0;
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
			if(arr[i]==arr[j]){
				sum=sum+arr[i];
			}
		}
	}
	System.out.println("Sum:"+sum);
}
}
