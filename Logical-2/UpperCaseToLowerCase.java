package interview;

import java.util.Scanner;

public class UpperCaseToLowerCase {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter The String");
	 String s1=sc.next();
	 String s2="";
	 for(int i=0;i<s1.length();i++){
		 char c=s1.charAt(i);
		 if(c>='a'&&c<='z'){
			 s2=s1.toUpperCase();
			 s2=s2+c;
		 }
		 else if(c>='A'&&c<='Z'){
			 s2=s1.toLowerCase();
			 s2=s2+c;
		 }
		 else{
			 s2=s2+c;
		 }
	 }
	 System.out.print(s2);
//	 for(int i=0;i<s1.length();i++){
//		 char c=s1.charAt(i);
//		 if(c>='a'&&c<='z'){
//			 c-=32;
//			 s2=s2+c;
//		 }
//		 else if(c>='A'&&c<='Z'){
//			 c+=32;
//			 s2=s2+c;
//		 }
//		 else{
//			 s2=s2+c;
//		 }
//	 }
//	 System.out.print(s2);
}
}
