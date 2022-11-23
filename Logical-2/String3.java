package interview;

public class String3 {
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
		String s1 = "Hellohi123bye124hi745";
		String s2 = "";
		String s3 = "";
		int n = 5;
		for(int i=0;i<s1.length()-1;i++) {
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9') {

				if(i==s1.length()-2) {
					if(s1.charAt(i)>='0' && s1.charAt(i)<='9') {
						s2 = s2 + s1.charAt(i)+s1.charAt(i+1);
						int n1 = stringToInt(s2)+n;
						s3 = s3+n1;
						s2=""; 
					}
				}
				else if(!(s1.charAt(i+1)>='0' && s1.charAt(i+1)<='9')) {
					s2 = s2 + s1.charAt(i);
					int n1 = stringToInt(s2)+n;
					s3 = s3+n1;
					s2="";

				}else {
					s2 = s2 + s1.charAt(i);
				}
			}else {
				if(i==s1.length()-2 && (s1.charAt(i)>='0' && s1.charAt(i)<='9') ) {
					if(s1.charAt(i+1)>='0' && s1.charAt(i+1)<='9') {
						s3= s3+s1.charAt(i);
						s2 = s2+s1.charAt(i+1);
						int n1 = stringToInt(s2)+n;
						s3 = s3+n1;
						s2="";
					}else {
						s3 = s3 + s1.charAt(i)+s1.charAt(i+1);
					}
				}else {
					s3= s3+s1.charAt(i);
				}

			}
		}

		System.out.println(s3);
	}
}
