package interview;

import java.util.Scanner;

public class RemoveExtraSpaces {
public static void main(String[] args) {
//	String s = "      hello      there  hi      bye ";
//	s = s.trim().replaceAll("[ ]{1,}"," ");
//	System.out.println(s);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The String");
String s=sc.nextLine();
String s1="";
String s2="";
for(int i=0;i<s.length();i++){
	if(s.charAt(i)==' '&&s.charAt(i+1)==' '){
		s1=s1+s.charAt(i);
	}
	else{
		s2=s2+s.charAt(i);
	}
}
System.out.print(s2+" ");
//System.out.println("\\\dhiiiiiiiiiii");
}
}
