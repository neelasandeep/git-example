package inputoutput_operations;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileCopy {

	public static void main(String[] args) throws IOException{
		FileInputStream fin;
        FileOutputStream fout;
		System.out.println("Enter the input File Name");
		 int i;
         Scanner sc=new Scanner(System.in);
         String input=sc.next();
         
         try {
        	 fin=new FileInputStream(input);
         }catch(FileNotFoundException e) {
        	 System.out.println("File not Found");
        	 return;
         }
         System.out.println("Enter output File Name");
         String output=sc.next();
         try {
        	 fout=new FileOutputStream(output);
        	 do {
        		i=fin.read();
        		 if(i!=-1)
        			 fout.write(i);
        	 }while(i!=-1);
        	 System.out.println("File Copied");
         }catch(IOException e) {
        	 System.out.println("Cannot create file");
         }
         sc.close();
         fin.close();
         
	}

}
