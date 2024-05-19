
public class Print {

	 public static void printnum(int num) {
		 if(num<=100) {
			 System.out.println(num);
			 num++;
			 printnum(num);
		 }
	 }
	
	
	public static void main(String[] args) {
		printnum(1);

	}
  
}
