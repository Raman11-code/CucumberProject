
public class ArithmeticConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		System.out.println(10/2);
		System.out.println(9/2);//4
		System.out.println(9/2.0);//4.5
		System.out.println(8/3);//2
		System.out.println(9.0/2.0);//4.5
		//System.out.println(9/0);//ArithmeticException:--Is defined for pure Integer number 
	
		System.out.println(9.0/0);//Infinity--- When any number is not integer then we get Infinity
		
		
		System.out.println(0/9);//0
		System.out.println(9/0.0);//Infinity
		//System.out.println(0/0);//ArithmeticException
		System.out.println(0.0/0);//NAN--NotANumber
		
		System.out.println(9%3);//% --Modulus Operator which gives remainder
		
		System.out.println(9%2);
		
		System.out.println(11%2);
		
	
		System.out.println(17%3);
		
		//System.out.println(100/0 +"Hello");//Arithmetic Exception
		
		System.out.println(100/2 +"Hello");
		
		String c = "Hello";
		String d = "World";
		System.out.println(c+d);
		System.out.println(c+" " +d);
		
		
		/*Note 
		 * 1. NAN -- When both the number are zero e.g(System.out.println(0.0/0));
		 * 2. Infinity --  When any number is not integer then we get Infinity e.g(System.out.println(9/0.0);//Infinity);
		 * 3. ArithmeticException:--Is defined for pure Integer number e.g(System.out.println(9/0);
		 * 
		 * 
		 * 
		 * 
		 */
	}

}
