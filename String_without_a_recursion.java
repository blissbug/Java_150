package java_topic_wise;

public class String_without_a_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="baccad";
		System.out.println(without(str,""));
	}public static String without(String str,String ans) {
		if(str=="") {
			return ans;
		}
		if(str.charAt(0)=='a') {
			return without(str.substring(1),ans);
		}
		return without(str.substring(1),ans+str.charAt(0));
		
	}

}
