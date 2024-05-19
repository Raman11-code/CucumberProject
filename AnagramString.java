import java.util.Arrays;

public class AnagramString {
//Anagram String -- IF both the String contain same Letter
	public static void main(String[] args) {
		String str1 = "silence";
		String str2 = "lisence";
		char[] words = str1.toLowerCase().toCharArray();
		char[] word = str2.toLowerCase().toCharArray();
		Arrays.sort(words);
		Arrays.sort(word);
		if(Arrays.equals(words, word)) {
			System.out.println("AnagramString");
		}
		else {
			System.out.println("NotAnagramString");
		}

	}

}
