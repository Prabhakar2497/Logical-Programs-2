package interview;
class A{
	int a=10;
	void display(){
		System.out.println("class A");
	}
}
class B extends A{
	int a=20;
	void display(){
		System.out.println("class B");
	}
}
public class Test2 {
public static void main(String[] args) {
	A b=new B();
	System.out.println(b.a);
	b.display();
	 
}
}
