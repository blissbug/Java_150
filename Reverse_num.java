package java_topic_wise;

public class Reverse_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rev_num(10089,0));

	}
	public static int rev_num(int num, int i) {
		if(num==0) {
			return i;
		}
		return rev_num(num/10,i*10+(num%10));
	}


}
