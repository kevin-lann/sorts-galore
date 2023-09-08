import java.util.ArrayList;
import java.util.Scanner;

public class sortTester {

	public static void main(String[] args) {
		
		//-- Arraylist size --
		int elements = 1000;
		
		ArrayList<Integer> arr = new ArrayList<Integer>(elements);
		for(int i = 0; i < elements; i++){
			arr.add((int)(Math.random() * elements));
		}

		int t1 = (int) System.currentTimeMillis();
		
		//System.out.println(arr);
		System.out.println("Enter sort type: \n");
		Scanner input = new Scanner(System.in);
		String optn = input.nextLine();
		
		if (optn.equals("bubble")){
			new bubbleSort(arr);
		}
		else if(optn.equals("counting")) {
			new countingSort(arr);
		}
		else if(optn.equals("insertion")) {
			new insertionSort(arr);
		}
		else if(optn.equals("selection")) {
			new selectionSort(arr);
		}
		else {
			System.out.println("Invalid option.");
			return;
		}
		input.close();
		
		//System.out.println(arr);
		
		int timeTaken = (int) (System.currentTimeMillis() - t1);
		
		System.out.println(timeTaken + " ms");

	}
	
	public static void printAll(int[] arr){
		for(int n : arr){
			System.out.print(n + ", ");
		}
	}

}
