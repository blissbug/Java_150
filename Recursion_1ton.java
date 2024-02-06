package java_topic_wise;

public class Recursion_1ton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		to_n(n);

	}public static void to_n(int n) {
		if(n==1) {
			System.out.println(n);	
			return;
		}
		to_n(n-1);
		System.out.println(n);
	}

}