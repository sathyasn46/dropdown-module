package dropdown.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DropDownScript2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "";  
		String splitBy = ",";  
		try   
		{  
		//parsing a CSV file into BufferedReader class constructor  
		BufferedReader br = new BufferedReader(new FileReader("C://Denied-Rules-1.csv"));
		System.out.println("DENIED STATUS REASON - Rules");
		while ((line = br.readLine()) != null)   //returns a Boolean value  
		{  
		String[] ruleRow = line.split(splitBy);    // use comma as separator  
		System.out.println("[Backend Value=" + ruleRow[0] + ", Disaplay Value=" + ruleRow[1] + ", CASE TYPE IN=" + ruleRow[2] + ", CASE TYPE NOT IN=" + ruleRow[3] + ", REQUEST TYPE IN= " + ruleRow[4] + ", REQUEST TYPE NOT IN=" + ruleRow[5] +
				", LOB IN="+ruleRow[6]+ ", LOB NOT IN="+ruleRow[7]+ ", APP INSTANCE="+ruleRow[8]+", DISPLAY ACTION="+ruleRow[9]+ "]");  
		}  
		}   
		catch (IOException e)   
		{  
		e.printStackTrace();  
		}  
	}

}
