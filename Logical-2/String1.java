package interview;

public class String1 {
public static void main(String[] args) {
	String s="a1b2c3d4";
	char arr[]=s.toCharArray();
	int i=0;
	int count=0;
	char c;
	int f;
	while(i<s.length()){
		c=arr[i];
		f=arr[i+1]-'0';
		for(int j=1;j<=f;j++){
			System.out.print(c);
			count++;
		}
		i=i+2;
	}
}
}
