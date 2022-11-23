package interview;

public class Test3 {
	private void m2(){
		m1();
		System.out.println("1");
	}
	private void m1(){
		m2();
			System.out.println("2");
		}
	private void m3(){
		System.out.println("3");
		try{
			System.out.println(4/0);
			System.out.println("4");
		}
		catch(Exception e){
			System.out.println("5");
		}
	}
public static void main(String[] args) {
	Test3 t=new Test3();
	t.m1();
}
}
