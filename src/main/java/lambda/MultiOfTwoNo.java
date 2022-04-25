package lambda;

public class MultiOfTwoNo {

	public static void main(String[] args) {
	
		Multi m = (int i) -> {
					return i * i;
		};
		System.out.println(m.multi(5));
		
	}
	

}
