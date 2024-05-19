
public class ReverseInteger {
	public static void reverseNumber(int num) {
		int rev=0;
		//int r =0;
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
	reverseNumber(32112);
		
		
		

	}

}
