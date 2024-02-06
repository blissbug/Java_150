package java_topic_wise;

public class N_to_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(5);

	}public static void print(int n) {
		if(n==1) {
			System.out.println(n);
			return;
		}
		System.out.println(n);
		print(n-1);
		return;
	}

}
