import java.util.ArrayList;

public class countingSort {
	
	private ArrayList<Integer> arr = new ArrayList<Integer>();
	
	public countingSort(ArrayList<Integer> a){
		arr = a;
		sort();
	}
	
	private void sort(){
		int max = 1000;
		int value;
		int[] count = new int[arr.size() - 1];
		
		//increase count of elements
		for(int i = 0; i < arr.size(); i++){
			value = arr.get(i);
			count[value]++;
		}
		
		//clear array list
		arr.clear();
		
		//rewrite array
		for(int i = 0; i < max + 1; i++){
			//if at least one of the number
			if(arr.get(i) > 0){
				for(int j = 0; j < count[i]; j++){
					arr.add(i);
				}
			}
		}
	}
	
}
