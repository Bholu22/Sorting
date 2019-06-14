// C++ program to sort even positioned elements 
// in ascending order and odd positioned 
// elements in descending order. 
#include<stdio.h> 
#include<stdlib.h> 
using namespace std;
// Function to calculate the given problem. 
void evenOddInsertionSort(int arr[], int n) 
{ 
for (int i = 2; i < n; i++) 
{ 
	int j = i-2; 
	int temp = arr[i]; 
		
	/* checking whether the position is even 
		or odd. And after checking applying the 
		insertion sort to the given 
		positioned elements.*/	
	
	// checking for odd positioned. 
	if ((i+1) & 1 == 1) 
	{ 
		// Inserting even positioned elements 
		// in ascending order. 
		while (temp >= arr[j] && j >= 0) 
		{ 
			arr[j+2] = arr[j]; 
			j -= 2; 
		} 
		arr[j+2] = temp;			 
	} 
	
	// sorting the even positioned. 
	else { 

		// Inserting odd positioned elements 
		// in descending order. 
		while (temp <= arr[j] && j >= 0) 
		{ 
			arr[j+2] = arr[j]; 
		j -= 2; 
		} 
		arr[j+2] = temp; 
	} 
} 
} 

// A utility function to print an array of size n 
void printArray(int arr[], int n) 
{ 
	for (int i=0; i < n; i++) 
		printf("%d ", arr[i]); 
	printf("\n"); 
} 

/* Driver program to test insertion sort */
int main() 
{ 
	int arr[] = {12, 11, 13, 5, 6}; 
	int n = sizeof(arr)/sizeof(arr[0]); 

	evenOddInsertionSort(arr, n); 
	printArray(arr, n); 

	return 0; 
} 

