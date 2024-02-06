package java_topic_wise;

public class Skip_String_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="bcdappleth";
		System.out.println(skip_apple(str));
	}
	public static String skip_apple(String str) {
		if(str=="") {
			return "";
		}
		if(str.startsWith("apple")) {
			return ""+skip_apple(str.substring(5));
		}
		return str.charAt(0)+skip_apple(str.substring(1));
	}

}
