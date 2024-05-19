
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = {1,2,3,4,5,6,7,8,10};
		int sum1 =0;
		int sum2 =0;
		for(int i =0;i<ar.length;i++) {
			sum1 = sum1 + ar[i];
		}
		System.out.println(sum1);
		
		for(int i=1;i<=10;i++) {
			sum2 = sum2 +i;
		}
System.out.println(sum2);

System.out.println("Missing Number in an Array+ "+(sum2-sum1));
}
}