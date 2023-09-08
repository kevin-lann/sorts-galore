import java.util.ArrayList;

public class selectionSort {
	
	private ArrayList<Integer> arr = new ArrayList<Integer>();
	
	public selectionSort(ArrayList<Integer> a){
		arr = a;
		sort();
	}
	
	private void sort(){
		int mindex = 0;
		int thres = 0;
		
		while(thres < arr.size()){
			mindex = thres;
			
			//find smallest element
			for(int i = thres; i < arr.size(); i++){
				if(arr.get(i) < arr.get(mindex)) mindex = i;
			}
			
			//swap
			int temp = arr.get(thres);
			arr.set(thres, arr.get(mindex));
			arr.set(mindex, temp);
			
			thres++;
		}
	}
}
