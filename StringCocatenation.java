
public class StringCocatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Today is Monday";
		int result = str.length()-str.replaceAll("a", "").length();
		System.out.println("a"+ result);
    int a = 100;
    int b= 200;
    
    System.out.println(a+b);
    
    String x = "Hello";
    String y = "World";
    
    double d1 = 12.33;
    double d2 = 12.44;
    char c1 = 'a';
    char c2= 'b';
    
    System.out.println(x+y);
    System.out.println(a+x);
    System.out.println(b+y);
    System.out.println(x+y+a+b);//HelloWorld100200
    
    System.out.println(a+b+x+y);//300HelloWorld
    System.out.println(x+y+(a+b));//HelloWorld300
    
    System.out.println("Hello Raman");
    System.out.println("The value of a :"+ a);
    System.out.println("The value of  b :"+b);
    System.out.println("The sum is :"+ (a+b));
    
    System.out.println(a+b+x+y+a+b);//300HelloWorld100200

    System.out.println(a+b+x+y+(a+b));//300HelloWorld300
    
    System.out.println(x+y+d1+d2);//HelloWorld12.3312.44
    //Note: String can be concatenated with any type of data;
    
    System.out.println(x+c1);
    System.out.println(x+y+(c1+c2));
    
    
    
    
	}

}
