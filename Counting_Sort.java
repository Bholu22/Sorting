public class Counting_Sort{
	static void sort(int arr[]){
		int n=arr.length;
		int output[]=new int[n];
		int count[]=new int[9];
		for(int i=0;i<9;i++)
			count[i]=0;
		for(int i=0;i<n;i++)
			++count[arr[i]];
		for(int i=1;i<=8;i++)
			count[i]+=count[i-1];
		for(int i=n-1;i>=0;i--)
		{	output[count[arr[i]]-1]=arr[i];
			--count[arr[i]];
		}
		for(int i=0;i<n;i++){
			arr[i]=output[i];
		}
	}
	public static void main(String args[]){
		int arr[]={4,8,6,4,2,1,2,3,4};
		sort(arr);
		System.out.println("Array after counting sort!!!");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}