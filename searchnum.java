package question1;
import java.util.Scanner;

public class searchnum {
	   public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter number of elements in the sequence: ");
		        int n = scanner.nextInt();
		       int[] numbers = new int[n];
		        System.out.println("Enter the elements of the sequence:");
		        for (int i = 0; i < n; i++) {
		            numbers[i] = scanner.nextInt();
		        }
		        System.out.print("Enter the number to be searched: ");
		        int searchNumber = scanner.nextInt();
		        
		        int count = 0;
		        for (int i = 0; i < n; i++) {
		            if (numbers[i] == searchNumber) {
		                count++;
		                }
		           }
		        System.out.println("the amount of time the element found is:"+count);
			


	}

}
