package interview;

import java.util.Scanner;

public class RandomNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The First Number");
	int min=sc.nextInt();
	System.out.println("Enter The Second Number");
	int max=sc.nextInt();
	System.out.println("Random Number of type double Between "+min+" and "+ max);
	double a=Math.random()*(max-min+1)+min;
	System.out.println(a);
	int b=(int) (Math.random()*(max-min+1)+min);
	System.out.println("Random Number of type int Between "+min+" and "+ max);
	System.out.println(b);
}
}
