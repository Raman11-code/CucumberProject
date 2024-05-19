
public class StringWordReverse {
	
public static String ReverseWords(String str) {
	String[] words = str.split(" +");
	StringBuilder sbf = new StringBuilder();
	for(int i = words.length-1;i>=0;i--) {
		sbf.append(words[i]);
		sbf.append(" ");
	}
	return sbf.toString().trim();	
	
}


public static void main (String[] args) {
	System.out.println(ReverseWords("My Name is Raman"));
}
}
