package interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringIsPresentOrNot {
public static void main(String[] args) {
	String s1="Royal Challengers Bangalore";
	String s2="Challengers";
	Pattern p=Pattern.compile(".*"+s2+".*");
	Matcher m=p.matcher(s1);
	boolean ans=m.matches();
	System.out.println(ans);
}
}
