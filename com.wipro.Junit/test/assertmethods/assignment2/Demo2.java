package assertmethods.assignment2;

public class Demo2 {
 public boolean palindromeCheck(String str) {
	 int n=str.length();
	 int mid=n/2;
	 if(n%2==0)mid--;
	 boolean palindrome=true;
	 for(int i=0;i<=mid;i++) {
		 if(str.charAt(i)!=str.charAt(n-i-1)) palindrome=false;
	 }
	 return palindrome;
 }
}
