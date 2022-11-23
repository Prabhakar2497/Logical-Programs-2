package interview;

public class SumOfDuplicates {
	public static int sumRepeated(int arr[]){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					sum=sum+arr[i];
				}
			}
		}
		return sum;
	}
public static void main(String[] args) {
	int arr[]={1,2,3,4,5,6,4,5};
	System.out.println(sumRepeated(arr));
}
}
