package java_topic_wise;

public class Recursion_string_reversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="cats";
		System.out.println(reversestring(str));

	}public static String reversestring(String str) {
		if(str.length()<2) {
			return str;
		}
		char last=str.charAt(str.length()-1);
		String curr_str=str.substring(0,str.length()-1);
		return last+reversestring(curr_str);
		
	}

}
