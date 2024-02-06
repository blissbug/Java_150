package java_topic_wise;

public class Sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum_dig(2005));
		System.out.println(prod_dig(2034));


	}public static int sum_dig(int n) {
		if(n<10) {
			return n;
		}
		return sum_dig(n/10)+n%10;
	}
	public static int prod_dig(int n) {
		if(n<10) {
			return n;
		}
		return prod_dig(n/10)*(n%10);
	}

}
