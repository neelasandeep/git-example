package tm10_project6;

import java.util.ArrayList;
public class TestString {
	String s1="javajava";
	String s2="va";
	ArrayList<String> al=new ArrayList<>();
	public static void main(String[] args) {
		TestString ts=new TestString();
		ArrayList<String> al1=ts.operations();
		
		System.out.println("Output:"+al1);
	

	}
	public ArrayList<String>  operations() {
		String temp="";
		// Operation:1 replacing alternate Character of s1 with s2
		if(s1.contains(s2)) {
			
			  temp=s2+s1.charAt(1);
			 for(int i=3;i<s1.length();i++) {
				temp=temp+s2+s1.charAt(i);
				i++;
				  }
          if(s1.length()%2!=0)temp=temp+s2;
			
			al.add(temp);
	   //end of Operation 1		
			
			
			
		// Operation :2 Reversing last occurrence of s2 if it occurred more than 1	
			 int count=0;
			  temp=s1;
			while(temp.contains(s2)) {
			temp= temp.replaceFirst(s2, "");
			 count++;
				 }
			 temp=s1;
			if(count>1) {
     		 int index=s1.lastIndexOf(s2);
     		 int j=s2.length()-1;
			 char[] ch=temp.toCharArray();
			 for(int i= index;i<index+s2.length();i++) {
				ch[i]=s2.charAt(j);
				 j--;
			 }
			 temp=String.copyValueOf(ch);
			
					 al.add(temp);
		// operation 2 ended
					 
	    //operation 3 removing First occurrence of s2				 
			 temp=s1;
		     temp=temp.replaceFirst(s2, "");
			
			 al.add(temp);
	  
			  }else {
					 temp=s1+s2;
					
					 al.add(temp);
				 }
			//end of Operation 3		
			
				
		//Operation :4 dividing S2 and adding half to beggining and half to ending
			int n=s2.length();
			      temp=s1;;
				if(n%2==0) {
					for(int i=n/2-1;i>=0;i--) {
						temp=s2.charAt(i)+temp;
					}
					for(int i=n/2;i<s2.length();i++) {
						temp=temp+s2.charAt(i);
					}
				}else {
					for(int i=n/2;i>=0;i--) {
						temp=s2.charAt(i)+temp;
					}
					for(int i=n/2+1;i<s2.length();i++) {
						temp=temp+s2.charAt(i);
					}
					
				}
			
				al.add(temp);
	// end of Operation 4
				
				
	//operation 5 replacing all s2 character occurrence with *
				temp=s1;
				char[] ch=s2.toCharArray();
				for(int i=0;i<s1.length();i++) {
					for(int j=0;j<s2.length();j++) {
						if(s1.charAt(i)==ch[j]) {
							temp=temp.replace(s1.charAt(i), '*');
						}
					}
				}
			
				al.add(temp);
				
	// end of Operation 5
					
		 }
		return al;
	 }
	

}
