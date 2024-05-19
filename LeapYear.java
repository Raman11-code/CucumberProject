
public class LeapYear {

	
	public static void IsLeapYear(int year) {
		if(year%400==0 || year%100!=0 ||year %4==0) {
			System.out.println("Is leap year");
		}
		else {
			System.out.println("Not Leap year");
		}
	}
	public static void main(String[] args) {
		IsLeapYear(2024);
	}
}
