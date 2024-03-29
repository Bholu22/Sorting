public class Stable_selectionsort 
{ 
	static void Sort(int[] a, int n) 
	{ 
		 for (int i = 0; i < n - 1; i++) 
		{  
			int min = i; 
			for (int j = i + 1; j < n; j++) 
				if (a[min] > a[j]) 
					min = j;

			// Move minimum element at current i. 
			int key = a[min]; 
			while (min > i) 
			{ 
				a[min] = a[min - 1]; 
				min--; 
			} 
			
			a[i] = key; 
		} 
	} 

	public static void main (String[] args) 
	{ 
		int[] a = { 4, 5, 3, 2, 4, 1 }; 
		int n = a.length; 
		Sort(a, n); 
		System.out.println("Array after insertion sort!!!");
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	} 
} 
