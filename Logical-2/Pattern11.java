package interview;

public class Pattern11 {
public static void main(String[] args) {
	int n=1;
	for(int i=1;i<=4;i++){
		for(int j=1;j<=4;j++){
			if(i>=j){
				if(n%2==0){
				System.out.print("0"+" ");
			}
			else{
				System.out.print("1"+" ");
			}
			n++;
		}
		else{
			System.out.print(" ");
		}
		}
		System.out.println();
	}
}
}
