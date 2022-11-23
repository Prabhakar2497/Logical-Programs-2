package interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression1 {
public static void main(String[] args) {
	String s="apple";
	Pattern p=Pattern.compile(".*e");
	Matcher m=p.matcher(s);
	boolean ans=m.matches();
	System.out.println(ans);
}
}
