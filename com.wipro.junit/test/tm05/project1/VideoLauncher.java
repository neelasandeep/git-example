package tm05.project1;
import java.util.Scanner;
public class VideoLauncher {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		VideoStore vl=new VideoStore();
		 String name;
		 int rating;
		 int choice;
		do {
		System.out.println("Main Menu");
		System.out.println("===========");
		System.out.println("1.Add Videos\n2.Checkout Video\n3.Return Video\n4.Receive rating\n5.List Inventory\n6.Exit");
		System.out.println("Enter your Choice (1..6)");
		choice = sc.hasNextInt() ? sc.nextInt() : 6;
		
		
		switch(choice) {
		case 1:System.out.println("Enter the name of Video you want");
		         name=sc.next();
		       
		       vl.addVideo(name);
		       System.out.println("Video "+name+" added Sucessfully");
		       break;
		case 2:System.out.println("Enter the video that You want to Checkout");
	           name=sc.next();
	           vl.doCheckOut(name);
	           System.out.println("Video "+name+" Checked out Sucessfully");
		       break;
		case 3:  System.out.println("Enter the video that You want to Return");
                  name=sc.next();
               vl.doReturn(name);
              System.out.println("Video "+name+" Returned Sucessfully");
	       break;
		case 4:System.out.println("Enter the video that You want to rate");
		       name=sc.next();
		       System.out.println("Enter the rating for this Video");
		       rating=sc.nextInt();
		       vl.receiveRating(name, rating);
		       System.out.println("Rating "+rating+" mapped to Video "+name);
		       break;
		case 5:vl.listInventory();
		break;
		case 6:System.out.println("Exiting ... Thanks for using the application");
	
		break;
		
		}
		
		}while(choice!=6);
      sc.close();
	}

}
