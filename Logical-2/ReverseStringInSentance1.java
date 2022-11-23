package interview;

public class ReverseStringInSentance1 {
public static void main(String[] args) {
	String s1="hello hi bye";
	String arr[]=s1.split(" ");
	for(String ele:arr){
		String s2="";
		for(int i=ele.length()-1;i>=0;i--){
			s2=s2+ele.charAt(i);
		}
		System.out.print(s2+" ");
	}
}
}
