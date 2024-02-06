package java_topic_wise;

public class Sliding_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Used to move through subarrays of an array.
		int[] arr= {3,4,5,6,7,8};
		int k=3;
		//
		System.out.println(sum_subarray(arr,k));

	}public static int sum_subarray(int[] arr,int k) {
		int sum_currsubarray=0;
		for(int i=0;i<k;i++) {
			sum_currsubarray+=arr[i];
		}
		int total_sum=sum_currsubarray;
		for(int i=1;i<arr.length-k+1;i++) {
			sum_currsubarray=sum_currsubarray-arr[i-1]+arr[i+k-1];
			total_sum+=sum_currsubarray;
		}
		return total_sum;
	}

}
