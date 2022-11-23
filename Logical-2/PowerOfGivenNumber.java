package interview;

import java.util.Scanner;

public class PowerOfGivenNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Base Value");
	int base=sc.nextInt();
	System.out.println("Enter The Exponent Value");
	int exponent=sc.nextInt();
	int fact=1;
	for(int i=1;i<=exponent;i++){
		fact=fact*base;
	}
	System.out.println("Power:"+fact);
}
}
