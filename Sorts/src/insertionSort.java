import java.util.ArrayList;

public class insertionSort {
	
	private ArrayList<Integer> arr = new ArrayList<Integer>();
	
	public insertionSort(ArrayList<Integer> a){
		arr = a;
		sort();
	}
	
	private void sort(){
		int key;
		int i;
		
		//loop through every unsorted element
		for(int thres = 1; thres < arr.size(); thres++){
			key = arr.get(thres);
			i = thres - 1;
			//shift all sorted elements to the right if greater than key
			while(i >= 0 && arr.get(i) > key){
				arr.set(i + 1, arr.get(i));
				i--;
			}
			//place key in spot right after element smaller or equal to it
			arr.set(i + 1, key);
		}
	}
}
