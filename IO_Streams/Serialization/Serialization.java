import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Serialization {
	
	public static void main(String[] args) {
		
		try {
			 String sDate1="31/12/1998";  
			 Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
			Employee obj = new Employee("Anubhav", date1 , "It", "System Engineer", 30000);
			
			FileOutputStream fout = new FileOutputStream("data");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(obj);
			oos.flush();
			oos.close();
			
		}
		
		catch(Exception e) {
			System.out.println("The error is: " + e);
		}
	}
	

}
