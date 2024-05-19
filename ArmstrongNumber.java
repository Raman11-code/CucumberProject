
public class ArmstrongNumber {
	public static void isArmstrongNumber(int num) {
		int cube =0;
		int r;
		int t;
		t = num;
		while(num!=0) {
			r = num%10;
			num = num/10;
			cube = cube  +(r*r*r);
			if(cube==t) {
				System.out.println("ArmstrongNumber");
			}
			
			
		}
	}

}
