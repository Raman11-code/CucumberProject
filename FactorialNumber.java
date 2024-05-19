
public class FactorialNumber {

	
	public static void factorialNumber(int num) {
		int factorial = 1;
		for(int i =1;i<=num;i++) {
			factorial = factorial *i;
		}
		System.out.println(factorial);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorialNumber(4);
	}

}
