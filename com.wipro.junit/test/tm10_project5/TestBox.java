package tm10_project5;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class TestBox {

	public static void main(String[] args) {
		HashSet<Box> b1=new HashSet<>();
		double length;
		double width;
		double height;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Box");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter Box "+i+" Details");
			System.out.println("Enter Length");
			length=sc.nextDouble();
			while(length==0||length<0) {
				System.out.println("Enter Valid length");
				length=sc.nextDouble();
			}
			System.out.println("Enter Width");
			width=sc.nextDouble();
			while(width==0||width<0) {
				System.out.println("Enter Valid width");
				width=sc.nextDouble();
			}
			System.out.println("Enter Height");
			height=sc.nextDouble();
			while(height==0||height<0) {
				System.out.println("Enter Valid height");
				height=sc.nextDouble();
			}
			b1.add(new Box(length,width,height));
		}
		System.out.println("Unique Boxes in the set are");
		Iterator<Box> itr=b1.iterator();
		while(itr.hasNext()) {
			Box c=itr.next();
			System.out.println("Length = "+c.Length+" Width = "+c.width+" Height = "+c.height+" Volume = "+c.Length*c.height*c.width);
		}
       sc.close();
	}
	

}
