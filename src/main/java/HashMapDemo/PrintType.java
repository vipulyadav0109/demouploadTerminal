package HashMapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintType {
	public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
 
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
        map.put("Amar", 22);
 
       //for each loop
        for (Map.Entry<String, Integer> e : map.entrySet())
            System.out.println("Key: " + e.getKey()
                               + " Value: " + e.getValue());
        // for each method
        map.forEach((key ,value )-> System.out.println(key+" "+value));
        
        //iteration with Stream API
        map.entrySet().stream().forEach(e -> System.out.println(e.getKey()+"  "+e.getValue()));
        
        //iteration over keys

        Set<String> keys = map.keySet();

        keys.forEach(System.out::println);
    
	// filtering
        Map<String, Integer> filteredCapitals = map.entrySet().stream()
                .filter(map1 ->  map1.getKey().startsWith("v"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        
        filteredCapitals.entrySet().forEach(System.out::println);
	
        //Map -> Stream -> Filter -> Map
        Map<String, Integer> result = map.entrySet().stream()
                .filter(map1 -> map1.getValue() == 10)
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

        System.out.println(result);
        
        //Streams filter() and collect()
        Map<String, Integer> result1 =  map.entrySet().stream()                // convert list to stream
                .filter(line -> line.getValue().equals("Amar"))     // we dont like mkyong
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));              // collect the output and convert streams to a List

       System.out.println(result1);
        
	}
}
