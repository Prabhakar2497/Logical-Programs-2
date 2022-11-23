package interview;
class Employee{
	String name;
	double salary;
	Employee(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	public String toString(){
		return "Name:"+name+"\tSalary:"+salary;
	}
}
public class Solution {
	public static void findHeighestSalary(Employee e1,Employee e2,Employee e3){
		if(e1.salary>e2.salary&&e1.salary>e3.salary){
			System.out.println(e1.name+" has the highest salary");
		}
		else if(e2.salary>e3.salary&&e2.salary>e1.salary){
			System.out.println(e2.name+" has the highest salary");
		}
		else{
			System.out.println(e3.name+" has the highest salary");
		}
	}
public static void main(String[] args) {
	Employee e1=new Employee("Tom",156.56);
	Employee e2=new Employee("Jerry",189.67);
	Employee e3=new Employee("David",178.23);
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e3);
	System.out.println("-----------");
	findHeighestSalary(e1, e2, e3);
}
}
