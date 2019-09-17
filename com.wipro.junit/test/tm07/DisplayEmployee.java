package tm07;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
public class DisplayEmployee {
     
	
	public int display(ArrayList<Employee1> emp1) {
		
		//WRITING OBJECTS TO THE empdata.txt FILE
		
		
		try {
		FileOutputStream fin=new FileOutputStream("empdata.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fin);
		oos.writeObject(emp1);
		fin.close();
		oos.close();
		
		}catch(IOException e ) {
			System.out.println("IOException occured");
		
		}
		
		
		
		//READING OBJECTS FROM  empdata.txt FILE
		ArrayList<Employee1> display;
		try {
		FileInputStream fis=new FileInputStream("empdata.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		display=(ArrayList<Employee1>)ois.readObject();
		if(display==null) {
			fis.close();
			ois.close();
			return 0;
			}
		System.out.println("---------Report--------");
		for(Employee1 emp:display) {
			
			System.out.printf("%-6d%-10s%-5d%.1f",emp.getId(),emp.getName(),emp.getAge(),emp.getSalary());
			System.out.println();
		}
		System.out.println();
		
		fis.close();
		ois.close();
		}catch(ClassNotFoundException ce) {
			System.out.println("ClassNotFoundexception occurred");
		}catch(FileNotFoundException fe) {
			System.out.println("FileNotFoundException occurred");
		}catch(IOException ie) {
			System.out.println("IOException occurred");
		}
		          
	
		return 1;
	}
}
