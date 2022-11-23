package interview;

public class ReplaceStringWithSpecialCharacter {
public static void main(String[] args) {
	String s="bangalore";
	 char []arr={'b','a','n','g','a','l','o','r','e'};
	 String s1=new String(arr);
	 for(int i=0;i<s1.length();i++){
		 char c=s1.charAt(i);
		 if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
			 
				break;
			}
		 System.out.print(arr[i]);
	 }
	  
}
}
