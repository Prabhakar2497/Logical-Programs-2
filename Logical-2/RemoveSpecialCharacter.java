package interview;

public class RemoveSpecialCharacter {
public static void main(String[] args) {
	String s="heLlo $ hI @ wElcOme";
	String arr[]=s.split(" ");
	String s1="";
	for(int i=0;i<s.length();i++){
		char c=s.charAt(i);
		if(c>='a'&&c<='z'||c>='A'&&c<='Z'){
			s1=s1+c;
		}
		
	}
	System.out.print(s1+" ");
}
}
