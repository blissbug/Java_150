package java_topic_wise;

public class Recursion_sumarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6};
		System.out.println(sumArray(arr,0,0));

	}
	public static int sumArray(int[] arr,int i,int sum) {
		if(i==arr.length) {
			return sum;
		}
		sum=sum+arr[i];
		return sumArray(arr,i+1,sum);
	}

}
