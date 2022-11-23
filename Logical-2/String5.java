package interview;

import java.util.Scanner;

public class String5 {
	public static String nonStart(String a,String b){
		return a.substring(1)+b.substring(1);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The First String");
	String a=sc.next();
	System.out.println("Enter The Second String");
	String b=sc.next();
	System.out.println(String5.nonStart(a, b));
}
}
