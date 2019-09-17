package practise;
import java.io.File;
public class CreateDir {

	public static void main(String[] args) {
		 String dirname = "/tmp";
	      File d = new File(dirname);
	      
	      // Create directory now.
	      System.out.println(d.mkdir());


	}

}
