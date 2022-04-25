package lambda;

public class LambdaExample11 {
	public static void print() {
		for(int i=0; i<5; i++) {
			System.out.println("Value of i "+i);
		}
	}
	public static void main(String[] args) {
		Thread th= new Thread(()->print());
		th.start();
	}
}
