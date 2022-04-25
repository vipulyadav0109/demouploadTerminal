package lambda;

import java.util.HashMap;
import java.util.Map;

public class LambdaHashMap {
	public static void main(String[] args) {
		Map<Integer, String> hashMap= new HashMap<Integer, String>();
		hashMap.put(1, "Onkar");
		hashMap.put(2, "Vipul");
		hashMap.put(3, "Nitin");
		
		hashMap.forEach((key, value)->{
			System.out.println(key+" "+value);
		});
		
	}
}
