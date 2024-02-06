package java_topic_wise;

public class Recursion_maxint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {};
		System.out.println(maxInt(arr,0,Integer.MIN_VALUE));

	}public static int maxInt(int[] arr,int i,int max) {
		if(i==arr.length) {
			return max;
		}
		if(arr[i]>max) {
			max=arr[i];
		}
		return maxInt(arr,i+1,max);
	}

}
