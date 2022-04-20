package test;

import java.io.File;
import java.io.FileReader;

public class ReadText {
	public static void main(String[] args) {
		char[] array = new char[1000];
	    try {
		FileReader f= new FileReader("/home/jbilling/demo.txt");
	
		// Reads characters
	      f.read(array);
	      System.out.println("Data in the file:");
	      System.out.println(array);

	      // Closes the reader
	      f.close();
	    }
	    catch(Exception e) {
	      e.printStackTrace();
	      
	    }
	  }
	}