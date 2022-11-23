package interview;

import java.util.Scanner;

public class SecondsToMinutes {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Seconds");
	int seconds=sc.nextInt();
	int hours=seconds/60;
	int minutes=seconds%60;
	System.out.println(hours+" hours "+minutes+" minutes");
}
}
