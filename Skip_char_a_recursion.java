package java_topic_wise;

public class Skip_char_a_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="baccad";
		System.out.println(without(str));

	}public static String without(String str) {
		if(str=="") {
			return "";
		}
		if(str.charAt(0)=='a') {
			return ""+without(str.substring(1));
		}
		return str.charAt(0)+without(str.substring(1));
	}

}
