public class Binary_Insertion{
	int binarysearch(int arr[],int key, int low ,int high){
		if(high<low)
			return key>arr[low]?low+1:low;
		
		int mid=(low+high)/2;
		if(key==arr[mid])
			return mid+1;
		if(key>arr[mid])
			return binarysearch(arr,key,mid+1,high);
		return binarysearch(arr,key,low,mid-1);
		
	}
	void sort(int arr[]){
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
		int key=arr[i];
		int j=i-1;
		int loc=binarysearch(arr,key,0,j);
		   while(j>=loc){
			   arr[j+1]=arr[j];
			   j--;
		   }
		   arr[j+1]=key;
		}
		
	}
	public static void main(String...a){
		int arr[]={66,34,22,78,44,66,23};
		new Binary_Insertion().sort(arr);
		int n=arr.length;
		System.out.println("Array after insertion sort!!!");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}