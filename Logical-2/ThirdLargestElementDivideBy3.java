package interview;

import java.util.ArrayList;
import java.util.Collections;

public class ThirdLargestElementDivideBy3 {
public static void main(String[] args) {
	int arr[]={34,23,3,45,67,90,123,30};
	ArrayList al=new ArrayList<>();
	for(int ele :arr){
		if(ele%3==0){
			al.add(ele);
		}
	}
	Collections.sort(al);
	int n=al.size()-3;
	System.out.println(al.get(n));
}
}
