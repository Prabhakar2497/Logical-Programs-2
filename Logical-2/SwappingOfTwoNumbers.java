package interview;

public class SwappingOfTwoNumbers {
public static void main(String[] args) {
	int a=10;
	int b=20;
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a:"+a);
	System.out.println("b:"+b);
	System.out.println("--------");
	int c=10;
	int d=20;
	int temp;
	temp=c;
	c=d;
	d=temp;
	System.out.println("c:"+c);
	System.out.println("d:"+d);
	System.out.println("---------");
	int e=10;
	int f=20;
	e=e*f;
	f=e/f;
	e=e/f;
	System.out.println("e:"+e+"\tf:"+f);
	
}
}
