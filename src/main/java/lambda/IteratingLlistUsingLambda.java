package lambda;

import java.util.ArrayList;
import java.util.List;

public class IteratingLlistUsingLambda {
	public static void main(String[] args) {
		List<String> listName= new ArrayList<String>();
		listName.add("Vipul");
		listName.add("Onkar");
		listName.add("Nitin");
		
		listName.forEach(name -> System.out.println(name));
		
		
	}
}
