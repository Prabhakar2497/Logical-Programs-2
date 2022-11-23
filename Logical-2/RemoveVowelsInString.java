package interview;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveVowelsInString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The String");
	String s1=sc.next();
	 String s2="";
	 s2=s1.replaceAll("[aeiou]","");
	 System.out.println(s2);
}
}
