package interview;

import java.util.Scanner;

public class SunnyNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number");
	int n=sc.nextInt()+1;
	int flag=0;
	for(int i=1;i<=n;i++){
		if(i*i==n){
			flag=1;
			break;
		}
	}
	if(flag==1){
		System.out.println("Sunny Number");
	}
	else{
		System.out.println("Not a Sunny Number");
	}
}
}
