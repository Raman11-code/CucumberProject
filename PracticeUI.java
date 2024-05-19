import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PracticeUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//        String[] geeks = {"Rahul", "Rahul",
//                          "Shubham", "Neelam"};
//		ArrayList<String> ar1 = new ArrayList<String>(Arrays.asList(geeks));
//		Set<String> withoutduplicates = new HashSet<String>(ar1);
//		System.out.println(withoutduplicates);
		
		
		int num[] = {2,4,1,4,5,3,9,10};
		ArrayList<Integer> n1 = new ArrayList<Integer>(Arrays.asList(2,4,1,4,5,3,9,10));
		//ArrayList<String> ar1 = new ArrayList<String>(Arrays.asList(geeks));
	Set<Integer> withoutduplicates = new HashSet<Integer>(n1);
	System.out.println(withoutduplicates);
		
		
	}

}
