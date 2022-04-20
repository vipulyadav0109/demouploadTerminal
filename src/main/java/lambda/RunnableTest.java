package lambda;

public class RunnableTest {
	public static void main(String[] args) {
		Runnable run =() -> {
			for(int i=0; i<=5; i++) {
				System.out.println("lambda :"+i);
			}
			
		
	};
	Thread th= new Thread(run);
	th.start();
	}
}
