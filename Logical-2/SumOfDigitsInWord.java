package interview;

public class SumOfDigitsInWord {
public static void main(String[] args) {
	String s1="hi 400 hello 300 ok 500 bye";
	String s2="";
	int n=0;
	int sum=0;
	for(int i=0;i<s1.length();i++){
		char c=s1.charAt(i);
		if(c==' '){
			if(s2.charAt(0)>='0'&&s2.charAt(0)<='9'){
				n=Integer.parseInt(s2);
				sum=sum+n;
			}
			s2="";
		}
			else{
				s2=s2+c;
			}
	}
		if(s2.charAt(0)>='0'&&s2.charAt(0)<='9'){
			n=Integer.parseInt(s2);
			sum=sum+n;
		}
		System.out.println("Sum:"+sum);
	
}
}
