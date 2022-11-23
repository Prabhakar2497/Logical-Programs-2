package interview;

public class Pattern8 {
public static void main(String[] args) {
	int n=1;
	for(int i=1;i<=4;i++){
		for(int j=i;j<=4;j++){
			System.out.print(n+" ");
			n++;
		}
		System.out.println();
	}
}
}
