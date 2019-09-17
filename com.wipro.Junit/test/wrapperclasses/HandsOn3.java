package wrapperclasses;

import java.util.Scanner;
public class HandsOn3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Integer between 1 and 255");
		int num=sc.nextInt();
		while(num<1||num>255) {
		
			System.out.println("Please Enter valid Integer between 1 and 25");
			num=sc.nextInt();
		}
		String binary=Integer.toBinaryString(num);
        num=Integer.parseInt(binary); 
        System.out.println(String.format("%08d", num));	
		
sc.close();
	}

}
