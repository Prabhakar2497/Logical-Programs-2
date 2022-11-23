package interview;

  class Test {
	static int x=100;
	void display(){
		 int x=200;
		System.out.println(x);
		System.out.println(this.x);
	}
	  
public static   void main(String[] args) {
	Test t=new Test();
	t.display();
	System.out.println(t.x);
}
}
