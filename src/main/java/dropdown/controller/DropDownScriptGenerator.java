package dropdown.controller;

import java.io.File;
//import java.io.FileNotFoundException;
import java.util.Scanner;

public class DropDownScriptGenerator {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DML script");
		
		Scanner sc = new Scanner(new File("C://Denied-Rules-1.csv"));  
		sc.useDelimiter(",");   //sets the delimiter pattern  
		while (sc.hasNext())  //returns a boolean value  
		{  
		System.out.print(sc.next()); 
		System.out.print(",");//find and returns the next complete token from this scanner  
		}   
		sc.close();  //closes the scanner  
		}  

}
