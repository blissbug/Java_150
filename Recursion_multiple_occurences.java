package java_topic_wise;

import java.util.ArrayList;
import java.util.List;

public class Recursion_multiple_occurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,4,4,5};
		ArrayList<Integer> ll=new ArrayList<>();
		Search_int_arr(arr,0,4,ll);
		System.out.print(ll);

	}public static void Search_int(int[] arr,int i,int num) {
		if(arr.length==i) {
			return;
		}
		if(arr[i]==num) {
			System.out.print(i+" ");
		}
		Search_int(arr,++i,num);
	}
	
	public static ArrayList<Integer> Search_int_arr(int[] arr,int i,int num,ArrayList<Integer> ll) {
		if(arr.length==i) {
			return ll;
		}
		if(arr[i]==num) {
			ll.add(i);
		}
		return Search_int_arr(arr,++i,num,ll);
	}
	
	public static ArrayList<Integer> Search_int_arr_upd(int[] arr,int i,int num) {
		ArrayList<Integer> ll=new ArrayList<>();
		if(arr.length==i) {
			return ll;
		}
		//contains answer for that function only
		if(arr[i]==num) {
			ll.add(i);
		}
		ArrayList<Integer> last_item=Search_int_arr_upd(arr,++i,num);
		ll.addAll(last_item);
		return ll;
	}

}
