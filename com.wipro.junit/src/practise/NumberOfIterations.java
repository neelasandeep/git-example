package practise;

public class NumberOfIterations {

	public static void main(String[] args) {
		int arr[]= {12,14,25,46,69,71,72,8,9,11};
		int k=new NumberOfIterations().findRotation(arr,arr.length,72);
		int m=new NumberOfIterations().numberOfRottion(arr,8);
		System.out.println(k+" "+m);
		int[][] ar= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		new NumberOfIterations().spiral(ar,3,4);
		int ar1[]= {2,2,3,4,5,5,5,5,6,7,7,7,8,8,9,9,10};
		int ar2[]=new NumberOfIterations().count(ar1);
		for(int i=0;i<ar2.length;i++) {if(ar2[i]!=0)System.out.println(ar1[i]+" occured "+ar2[i]+" times");}
	}
	 int findRotation(int[]arr,int n, int s) {
		int low=0,high=n-1,mid,pre,next;
		while(low<=high) {
			mid=(low+high)/2;
			if(arr[mid]==s)
			   return mid;
			if(arr[mid]<=arr[high])
				if(s<=arr[high]&&s>arr[mid]) low=mid+1;
				else high=mid-1;
			else{
				if(s>=arr[low]&&s<arr[mid]) high=mid-1;
				else low=mid+1;
				
			}	
			
		}
		return -1;
	}
	int numberOfRottion(int arr[],int n) {
		int low=0,high=n-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[low]<=arr[high])
				return low;
			int next=(mid+1)%n;
			int pre=(mid+n-1)%n;
			if(arr[mid]<=next&&arr[mid]<=pre) return mid;
			else if(arr[mid]<=arr[high])  high=mid-1;
			else if(arr[mid]>=arr[low])  low=mid+1;
		}
		
		
		return -1;
	}
	void spiral(int[][] arr,int m,int n) {
		int t=0,b=m-1,l=0,r=n-1,dir=0;
		while(t<=b&&l<=r) {
			if(dir==0) {
				for(int k=t;k<=r;k++) System.out.print(arr[t][k]);
				System.out.println();
				t++;	
			}else if(dir==1) {
				for(int k=t;k<=b;k++)System.out.print(arr[k][r]);
				System.out.println();
				r--;
			}else if(dir==2) {
				for(int k=r;k>=l;k--)System.out.print(arr[b][k]);
				System.out.println();
				b--;
			}else if(dir==3) {
				for(int k=b;k>=t;k--) System.out.print(arr[k][l]);
				System.out.println();
				l++;
			}
			dir=(dir+1)%4;
		}
	}
	int[] count(int[] arr) {
		int ar[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)ar[i]=-1;
		for(int i=0;i<arr.length;i++) {
			int cnt=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					cnt++;
					ar[j]=0;
				}
					
			}
			if(ar[i]!=0)
			ar[i]=cnt;
		}
		
		
			return ar;
	}
}
