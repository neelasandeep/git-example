package SerialAndDeserial;
import java.util.Date;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
public class EmployeeSerialize {

	public static void main(String[] args) {
		Employee e=new Employee("Sandeep",new Date(),"Developing","CheifEngineer",60000.0);
		try {
		FileOutputStream fis=new FileOutputStream("data.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fis);
		oos.writeObject(e);
		oos.close();
		fis.close();
		}catch(IOException exp) {
			System.out.println("IOException occuered");
		}

	}

}
