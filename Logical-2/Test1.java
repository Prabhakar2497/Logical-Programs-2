package interview;
class Player{
	String name;
	double average;
	Player(String name,double average){
		this.name=name;
		this.average=average;
	}
	public String toString(){
		return "Name:"+name+" Average:"+average;
	} 
}
public class Test1 {
public static void main(String[] args) {
	Player p1=new Player("Virat",67.87);
	Player p2=new Player("Dhoni",45.64);
	Player p3=new Player("Rohit",56.78);
	Player p4=new Player("Raina",68.90);
	Player p5=new Player("Sehwag",62.34);
	Player[]p={p1,p2,p3,p4,p5};
	Player max=p[0];
	for(int i=0;i<p.length;i++){
		if(p[i].average>max.average){
			max=p[i];
		}
	}
	System.out.println("Highest Average:\n"+max);
Player min=p[0];
for(int i=0;i<p.length;i++){
	if(p[i].average<min.average){
		min=p[i];
	}
}
System.out.println("Lowest Average:\n"+min);
System.out.println("--------------");
System.out.println("Average Between 60.0 and & 70.0:");
for(int i=0;i<p.length;i++){
	if(p[i].average>=60.00&&p[i].average<=70.00){
		System.out.println(p[i]);
	}
}
}
}
