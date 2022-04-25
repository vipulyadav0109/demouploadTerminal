package HashMapDemo;

import java.util.Arrays;
import java.util.List;

public class StreamFilterPerson {
 public static void main(String[] args) {
	
	 List<Person> personList= Arrays.asList(
			 					new Person("vipul", 24),
			 					new Person("Nitin", 26),
			 					new Person("Onkar", 22));
			 					
	 Person result = personList.stream().filter(p -> p.getAge()>25).findAny().orElse(null);
	 System.out.println(result);
	 
	 
	  Person result2 = personList.stream()
              .filter(p -> {
                  if ("vipul".equals(p.getName()) && 24 == p.getAge()) {
                      return true;
                  }
                  return false;
              }).findAny()
              .orElse(null);

      System.out.println("result 2 :" + result2);
	 
}
}
