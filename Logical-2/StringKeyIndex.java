package interview;

public class StringKeyIndex {
public static void main(String[] args) {
	String arr[]={"hello", "hi", "good", "morning"};
	String key="good";
	int flag=0;
	for(int i=0;i<arr.length;i++){
		if(arr[i]==key){
			System.out.println("Key:"+key+" Index Position:"+i);
			flag=1;
			break;
		}
	}
	if(flag==0){
		System.out.println("Key Not Found");
	}
}
}
