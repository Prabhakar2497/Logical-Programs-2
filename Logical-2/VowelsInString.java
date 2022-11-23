package interview;

public class VowelsInString {
public static void main(String[] args) {
	String s="gadag";
	int flag=0;
	for(int i=0;i<s.length();i++){
		char c=s.charAt(i);
	
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
	 flag=1;
	break;
	}
}
	if(flag==1){
		System.out.println("Vowels Present");
	}
	else{
		System.out.println("Vowels Not Present");
	}
}
}