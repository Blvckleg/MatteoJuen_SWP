
public class Insertionsort {

	    public static void insertionSort(int array[]) {  
	        int n = array.length;  
	        long startTime = System.currentTimeMillis();
	        for (int j = 0; j < n; j++) {  
	            int schieben = array[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( array [i] > schieben ) ) {  
	                array [i+1] = array [i];  
	                i--;  
	            }  
	            array[i+1] = schieben; 
	        }  
	        System.out.printf("Benötigte Zeit zum Sortieren in Millisekunden: ");
	        System.out.println(System.currentTimeMillis() - startTime);
	    }  
	    
	    
	       
	    public static void main(String a[]){    
	        int[] unsorted = {4,9,3,2,9,6,18,4,35,68};    
	        System.out.println("Unsorted Array");    
	        for(int i:unsorted){    
	            System.out.print(i+"|");    
	        }    
	        System.out.println();    
	            
	        insertionSort(unsorted);
	           
	        System.out.println("Sorted Array");    
	        for(int i:unsorted){    
	            System.out.print(i+"|");    
	        }    
	    }    
	}    

