package inputoutput_operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class CountCharacterInFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fin;
		int count=0;
		int i;
		char ch=0;
		System.out.println("Enter the input file name");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		try {
			fin=new FileInputStream(str);
			
		}catch(FileNotFoundException e) {
			System.out.println("File not Found");
			
			return;
		}
		System.out.println("Enter the character to be counted");
		
		
		try {
			InputStreamReader fis=new InputStreamReader(System.in);
			ch=(char) fis.read();
			do {
			i=fin.read();
			if(ch==(char)i) {
				count++;
				
			}
			}while(i!=-1);		
		} catch (IOException e) {
			
			System.out.println("File error");
		}
		
		System.out.println("File "+str+" has "+count+" instances of letter "+ch);
		fin.close();
		sc.close();
		

	}

}
