package java_topic_wise;

public class Sort_an_array_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,4,9,12};
		System.out.println(sorted_yet(arr,0));

	}public static boolean sorted_yet(int[] arr, int num) {
		if(num==arr.length-1) {
			return true;
		}
		
		return arr[num]<=arr[num+1] && sorted_yet(arr,++num);
	}

}
