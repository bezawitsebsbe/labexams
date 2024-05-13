package question3;

public class letterbubblesort {

	public static void main(String[] args) {
		  char[] alphabets = {'d', 'b', 'a', 'c', 'e'};
	        
	        System.out.println("Before sorting:");
	        printArray(alphabets);
	        
	        bubbleSort(alphabets);
	        
	        System.out.println("After sorting:");
	        printArray(alphabets);
	    }
	    
	    public static void bubbleSort(char[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    char temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }
	    
	    public static void printArray(char[] arr) {
	        for (char element : arr) {
	            System.out.print(element + " ");
	        }
	        System.out.println();
	    }

	}


