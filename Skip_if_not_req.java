package java_topic_wise;

public class Skip_if_not_req {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="bcdhappletbhappleareeool";
		System.out.println(with_apple(str));

	}
	public static String with_apple(String str) {
		if(str=="") {
			return "";
		}
		if(str.startsWith("apple")) {
			return "apple"+with_apple(str.substring(5));
		}
		return ""+with_apple(str.substring(1));
	}

}
