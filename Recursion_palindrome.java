package java_topic_wise;

public class Recursion_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="n|i|t|i|n|";
		System.out.println(ispalindrome(str,0,str.length()-1));

	}
	public static boolean ispalindrome(String str,int start,int end) {
		if(start==end || start>end) {
			return true;
		}
		if(str.charAt(start)==str.charAt(end)) {
			return ispalindrome(str,start+1,end-1);
		}
		return false;
	}

}
