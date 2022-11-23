package interview;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbersFromIndexPositionToNext5Numbers {
public static void main(String[] args) {
	ArrayList<Integer>al=new ArrayList<>();
	for(int i=1;i<=100;i++){
		int count=0;
		for(int j=1;j<=100;j++){
			if(i%j==0){
				count++;
			}
		}
		if(count==2){
			al.add(i);
		}
		for(int h=0;h<al.size();h++){
			System.out.println(al.get(h));
		}
	}
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Index Position");
	int index=sc.nextInt();
	for(int y=index;y<index+5;y++){
		System.out.println(al.get(y));
	}
}
}
