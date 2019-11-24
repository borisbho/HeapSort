package heapSort;

public class Driver {

	public static void main(String[] args) {
		
        int arr[] = {12, 11, 13, 5, 6, 7}; 
   
        HeapSort ob = new HeapSort(); 
        ob.sort(arr); 
  
        System.out.println("Sorted array is"); 
        ob.printArray(arr); 
	}

}
