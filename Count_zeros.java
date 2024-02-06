package java_topic_wise;

public class Count_zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count_zeros(20908,0));

	}public static int count_zeros(int num,int count) {
		if(num==0) {
			return count;
		}
		if(num%10==0) {
			count++;
		}
		return count_zeros(num/10,count);
	}

}
