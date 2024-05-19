
public class Armstrong {
	
	public static void IsArmstrong(int num) {
		int cube=0;
		int r;
		int t;
		t=num;
		while(num>0) {
			r = num%10;
			num = num/10;
			cube = cube +(r*r*r);
			
		}
		if(cube==t) {
			System.out.println("ArmstrongNumber");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsArmstrong(153);
	}

}
