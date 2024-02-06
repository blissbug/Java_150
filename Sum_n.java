package java_topic_wise;

public class Sum_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum_n(3));

	}
	public static int sum_n(int n) {
		if(n==1) {
			return 1;
		}
		return n+sum_n(n-1);
	}

}
