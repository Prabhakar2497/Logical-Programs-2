package interview;

public class String4 {
	public static void main(String[] args) {
		String ans=res("hello 90 ,bye 2 ",false,7);
		System.out.println("hello 90 , bye 2        :"+ans);
		System.out.println("hi 12345                :"+res("hi 12345",false,10));
		System.out.println("hello 007 ,bye 2       :"+res("hello 900 ,bye 4",false,0));
		System.out.println("hello 12345             :"+res("hello 12345",true,0));
		System.out.println("hello -12345            :"+res("hello -12335",false,0));
	}
	public static String res(String s,boolean reverse,int n){
		String ans="";
		int start=0;
		for(int i=0;i<s.length();i++){
			if((s.charAt(i)!='+'||s.charAt(i)!='-')&&!Character.isDigit(s.charAt(i))){
			ans+=s.charAt(i);
		}
		else{
			start=i;
			while(i<s.length()&&(Character.isDigit(s.charAt(i))||s.charAt(i)=='+'||
					s.charAt(i)=='-')){
				i++;
			}
			String sub=s.substring(start,i);
			Integer val=Integer.parseInt(sub)+n;
			if(reverse){
				val=reverse(val);
			}
			ans+=val;
		}
	}
		return ans;
}
public static int reverse(int n){
	int num=0;
	while(num>0){
		int r=n%10;
		num=num*10+r;
		n/=10;
	}
	return num;
}
}