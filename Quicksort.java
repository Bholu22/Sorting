public class Quicksort{
	static int partition(int arr[],int l,int h){
		int pivot=arr[h];
		int i=(l-1);
		for(int j=l;j<h;j++){
			if(arr[j]<=pivot){
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[h];
		arr[h]=temp;
		
		return i+1;
		
	}
	
	static void quicksort(int arr[],int l,int h){
		if(l<h){
			int pi=partition(arr,l,h);
			quicksort(arr,l,pi-1);
			quicksort(arr,pi+1,h);
		}
	}
	public static void main(String args[]){
		int arr[]={22,44,33,77,66,99,11,55,88};
		int n=arr.length-1;
		quicksort(arr,0,n);
		System.out.println("Arrays after sorting is: ");
		for(int i=0;i<=n;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
}