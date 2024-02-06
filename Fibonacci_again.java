package java_topic_wise;

public class Fibonacci_again {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0 1 1 2 3 5 8 13 
		//to find fib n
		System.out.println(fib(50));		
	}
	public static int fib(int n) {
		if(n==0){
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}

}
