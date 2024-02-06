package java_topic_wise;

public class Binary_search_by_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,5,7,9};
		System.out.println(binary_search(0,arr.length-1,3,arr));
	}
	public static int binary_search(int lo,int hi,int n,int[] arr) {
		if(lo>hi) {
			return -1;
		}
		int mid=lo+(hi-lo)/2;
		if(arr[mid]==n) {
			return mid;
		}
		if(arr[mid]>n) {
			hi=mid-1;
		}
		if(arr[mid]<n) {
			lo=mid+1;
		}
		return binary_search(lo,hi,n,arr);
	}

}
