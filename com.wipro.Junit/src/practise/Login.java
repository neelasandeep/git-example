package practise;



public class Login{
	
     public static void main(String[] args) {
    	 int arr[]= {1,2,2,3,3,3,4,4,4,4,4,5,5,5,5,5,6,6,6};
    	 int x=6;
    	 int h=count(arr,x,arr.length ,true);
    	 int l=count(arr,x,arr.length,false);
    	 System.out.println(h-l+1+" is the count of "+x);
 	}
     public static int count(int[] arr,int x,int n,boolean type) {
    	int low=0, high=n-1,result=-1;
    	while(low<=high) {
    		int mid=(low+high)/2;
if(x==arr[mid]) {
    			result=mid;
    			if(type) 
    				low=mid+1;
    			else
    				high=mid-1;
    			
    		}else if(x<arr[mid]) {
    			high=mid-1;
    		}else {
    			low=mid+1;
    		}
    	}
    	 
    	return result;
     }
   
}
