package interview;

public class SumOfDigitsInString {
public static void main(String[] args) {
	String s="bang12lo45re34ok";
	int sum=0;
	for(int i=0;i<s.length();i++){
		if(s.charAt(i)>='0'&&s.charAt(i)<='9')
		sum=sum+s.charAt(i)-'0';
	}
	System.out.println(sum);
}
}
