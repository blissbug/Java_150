package java_topic_wise;

public class Palindrome_check_by_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="123821";
		System.out.println(palin_check(str,0,str.length()-1));

	}
	public static boolean palin_check(String str,int s,int e) {
		if(e<s) {
			return true;
		}
		if(str.charAt(s)==str.charAt(e)) {
			return palin_check(str,++s,--e);
		}
		return false;
	}

}
