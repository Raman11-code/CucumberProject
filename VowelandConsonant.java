
public class VowelandConsonant {
// count the vowel and consonant in a string
	public static void main(String[] args) {
		String str  = "Ahreoa us";
		String str1 = str.replaceAll(" ", "");
		char[] ch = str1.trim().toLowerCase().toCharArray();
		int vowel =0;
		int consonant =0;
		for(int i = 0;i<ch.length;i++) {
			if(ch[i]=='a'||ch[i]== 'e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				vowel = vowel + 1;
				
			}
			else {
				consonant = consonant +1;
			}
			
		}
		System.out.println(vowel);
		System.out.println(consonant);
		
		
	}
}