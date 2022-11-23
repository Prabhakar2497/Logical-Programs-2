package interview;

import java.util.Scanner;

public class String2 {
	static int stringToInt(String s) {
		int num1=0;
		for(int i=0;i<s.length();i++) {
			int a = s.charAt(i);
			int num=a-48;
			num1 = (num1*10)+num;
		}
		return num1;
	}
public static void main(String[] args) {
	int n = 5;
	String s1="hEllo 123 Hi 128";
	String s2 = s1.toLowerCase();
	String s3[] = s2.split(" ");
	String s4 = "";
	

    for(int i=0;i<s3.length;i++) {
    	if(s3[i].charAt(0)>='0' && s3[i].charAt(0)<='9') {
            int n1 = stringToInt(s3[i])+5;
            
    		s4 = s4+n1+" ";
    	}else {
    		s4 = s4+s3[i]+" ";
    	}
    }
    System.out.println(s4);
}
}
