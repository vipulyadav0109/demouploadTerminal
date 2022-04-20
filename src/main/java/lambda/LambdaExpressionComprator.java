package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionComprator {
	public static void main(String[] args) {

		List<Student> listOfStudent = new ArrayList<>();

		// creating Student object using overloaded constructor
		Student s1 = new Student(2, "Akshay");
		Student s2 = new Student(4, "Rahul");
		Student s3 = new Student(6, "Amit");
		Student s4 = new Student(1, "Sammer");
		Student s5 = new Student(3, "Amar");

		// adding Student into list
		listOfStudent.add(s1);
		listOfStudent.add(s2);
		listOfStudent.add(s3);
		listOfStudent.add(s4);
		listOfStudent.add(s5);


		// sorting Student object on basis of name
		System.out.println("Sorting Student object on basis of name");

		Collections.sort(listOfStudent, (book1, book2) -> {
			return book1.name.compareTo(book2.name);
		});

		listOfStudent.forEach(name -> System.out.println("Roll:" + name.roll + "  NAME :" + name.name));

		// sorting book object on basis of id
		System.out.println("sorting Student object on basis of id");
		Collections.sort(listOfStudent, (roll1 , roll2)->{
			return roll1.roll - roll2.roll;
		});
		
		listOfStudent.forEach(roll-> System.out.println("Roll :" + roll.roll + "  NAME :"+ roll.name));
		
		
	}
}