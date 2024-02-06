package java_topic_wise;

public class Linear_search_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,4,5,6,7};
		System.out.println(check_num(arr,0,5));

	}
	public static int check_num(int[] arr,int idx,int num) {
		if(arr.length==idx) {
			return -1;
		}
		if(arr[idx]!=num) {
			return check_num(arr,++idx,num);
		}
		return idx;
		
	}

}
