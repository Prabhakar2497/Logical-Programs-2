package interview;

public class StringUnique {
public static void main(String[] args) {
	String s="hello";
	for(int i=0;i<s.length();i++){
		int flag=0;
		for(int j=0;j<s.length();j++){
			if(i!=j&&s.charAt(i)==s.charAt(j)){
				flag=1;
				break;
			}
		}
		if(flag==0){
			System.out.print(s.charAt(i));
		}
	}
}
}
