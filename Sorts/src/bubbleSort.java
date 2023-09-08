import java.util.ArrayList;

public class bubbleSort {

	private ArrayList<Integer> arr = new ArrayList<Integer>();
	
	public bubbleSort(ArrayList<Integer> a){
		arr = a;
		sort();
	}
	
	/**
	 * Sort the arraylist 
	 */
	private void sort(){
		int temp = 0;
		boolean flag;
		do{
			flag = false;
			for(int i = 0; i < arr.size() - 1; i++){
				//swap places
				if(arr.get(i) > arr.get(i+1)){
					temp = arr.get(i);
					arr.set(i, arr.get(i+1));
					arr.set(i+1, temp);
					flag = true;
				}
			}
		} while(flag);

	}
}
