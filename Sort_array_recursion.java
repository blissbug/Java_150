package java_topic_wise;
import java.util.*;
public class Sort_array_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr = new ArrayList<Integer>(Arrays.asList(5,1,0,2));
		arr=sort(arr);
		System.out.println(arr);
		
	}public static ArrayList sort(ArrayList<Integer> arr) {
		if(arr.size()==1) {
		return arr;
	}
		int temp=arr.get(arr.size()-1);
		arr.remove(arr.size()-1);
		sort(arr);
		
		insert(arr,temp);
		return arr;
	}
	public static ArrayList insert(ArrayList<Integer> arr, int temp) {
		if(arr.size()==0 || arr.get(arr.size()-1)<=temp) {
			arr.add(temp);
			return arr;
		}
		int val=arr.get(arr.size()-1);
		arr.remove(arr.size()-1);
		insert(arr,temp);
		
		arr.add(val);
		return arr;
			
		
	}
}
