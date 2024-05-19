import java.util.ArrayList;
import java.util.List;

public class Fizbuzz {
	public static void main(String[] args) {
		
	}
	public  List<String> fizzBuzz(int n) {
		// TODO Auto-generated method stub
		
		List<String> L1= new ArrayList<String>();
		
	for(int i=1;i<=15;i++) {
		
		if(i%3== 0&i%5==0) {
			L1.add("Fizbuzz");
			
		}
		else if(i%3 ==0) {
			L1.add("Fizz");
		}
		else if(i%5==0) {
			L1.add("Buzz");
		}
		else {
			L1.add(Integer.toString(i));
		}
	}
    return L1;
	}

}
