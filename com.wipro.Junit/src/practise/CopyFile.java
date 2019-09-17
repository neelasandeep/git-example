package practise;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class CopyFile {

	public static void main(String[] args)throws IOException {
		int i;
		FileInputStream fin;
		FileOutputStream fout;
		try {
			fin=new FileInputStream(args[0]);
			
		}catch(FileNotFoundException e) {
			System.out.println("Filoe not Found");
			return;
		}
		try {
			
			fout=new FileOutputStream(args[1]);
		}catch(IOException e) {
			System.out.println("cannot open file");
			return;
		}
		try {
			do {
				i=fin.read();
				if(i!=-1)
					fout.write(i);
			}while(i!=-1);
		}catch(IOException e) {
			System.out.println("File error");
			
		}
		fin.close();
		fout.close();

	}

}
