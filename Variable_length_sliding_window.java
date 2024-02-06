package java_topic_wise;

public class Variable_length_sliding_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,1,2,4};
		System.out.println(min_sum(arr));

	}public static int min_sum(int[] arr) {
		int min_sum=0;
		for(int k=1;k<=arr.length;k++) {
			int[] k_arr=new int[k];
			for(int i=0;i<k;i++) {
				k_arr[i]=arr[i];
			}
			min_sum+=min_arr(k_arr);
			System.out.println(min_arr(k_arr));
			for(int j=1;j<arr.length-k+1;j++) {
				for(int l=j;l<k+j;l++) {
					k_arr[l]=arr[l];
				}
				min_sum+=min_arr(k_arr);
				System.out.println(min_arr(k_arr));
			}
		}
		return min_sum;
	}
	public static int min_arr(int[] arr) {
		int min_val=arr[0];
		for(int i=1;i<arr.length;i++) {
			min_val=Math.min(min_val, arr[i]);
		}
		return min_val;
	}

}
