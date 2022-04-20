package lambda;

public class LambdaExample {
	public static void main(String[] args) {
		HelloW h1= new HelloWImp();
		h1.print();
		
		HelloW h2 = ()-> System.out.println("Hello Lambda");
		h2.print();
		
		
	}
	
}
