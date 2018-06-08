package Heap;


class HeapSort{
	
	public void sort(int a[]){
		
		int n = a.length;
		for(int i=n/2-1 ; i>=0 ; i--){
		  heapify(a,n,i);
		}
		
		for(int i=n-1; i>=0; i--)
        {
            // Move current root to end
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(a, i, 0);
        }
		
	}
	public void heapify(int a[] , int n , int i){
		int largest = i;
		int l = 2*i + 1;
		int r = 2*i + 2;
		
		if(l<n && a[l] > a[largest]){
			largest=l;
		}
		if(r<n && a[r] > a[largest]){
			largest=r;
		}
		
		if(largest!=i){
			int swap = a[largest];
			a[largest] = a[i];
			a[i] = swap;
			
			heapify(a,n,largest);
		}
		
		
	}
	
	public void printSortedHeap(int a[]){
		
		int x = a.length;
		
		for(int i = 0 ; i<x ; i++){
			System.out.println(a[i] + "");
		}
	}
	
}


public class HeapSortMain {
	
	public static void main(String[] args){
		
		int a[] = {1,10,15,5,20,7,50};
		int n = a.length;
		
	HeapSort hs = new HeapSort();
	
		hs.sort(a);
		hs.printSortedHeap(a);
		
	}

}
