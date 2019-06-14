public class Insertion_sort{
	static void sort(int arr[]){
		int n=arr.length;
		for(int i=1;i<n;i++){
			int key=arr[i];
			int j=i-1;
			  while(j>=0 && arr[j]>key){
				  arr[j+1]=arr[j];
				  j=j-1;
			  }
			  arr[j+1]=key;
		}
	}
	public static void main(String...a){
		int arr[]={66,34,22,78,44,66,23};
		sort(arr);
		int n=arr.length;
		System.out.println("Array after insertion sort!!!");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}