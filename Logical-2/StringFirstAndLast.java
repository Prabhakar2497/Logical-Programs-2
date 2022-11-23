package interview;

import java.util.Scanner;

public class StringFirstAndLast {
	public static String firstAndLast(String a,String b){
		if(a.length()==0){
			a="@";
		}
		if(b.length()==0){
			b="@";
		}
		return a.substring(0,1)+b.substring(b.length()-1);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The First String");
	String s1=sc.next();
	System.out.println("Enter The Second String");
	String s2=sc.next();
	System.out.println();
	System.out.println(StringFirstAndLast.firstAndLast(s1,s2));
}
}
