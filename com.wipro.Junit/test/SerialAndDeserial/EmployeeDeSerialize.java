package SerialAndDeserial;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class EmployeeDeSerialize {

	public static void main(String[] args) {
		Employee e=null;
		try {
		FileInputStream fin=new FileInputStream("data.txt");
		ObjectInputStream ois=new ObjectInputStream(fin);
		e=(Employee)ois.readObject();
		fin.close();
		ois.close();
		
		}catch(FileNotFoundException fe) {
			System.out.println("File not found");
		}catch(IOException ie) {
			System.out.println("IOException occurred");
		}catch(ClassNotFoundException ce) {
			System.out.println("ClassNotFoundException occurred");
		}
		System.out.println("after DeSerializing");
		System.out.println(e.name);
		System.out.println(e.DateOfbirth);
		System.out.println(e.Department);
		System.out.println(e.Destination);
		System.out.println(e.salary);
		

	}

}
