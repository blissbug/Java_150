package java_topic_wise;

public class Remove_one_char_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="baccad";
		remove_char(str,"");

	}public static void remove_char(String str,String ans) {
		if(str=="") {
			System.out.println(ans);
			return;
		}
		if(str.charAt(0)!='a') {
			ans=ans+str.charAt(0);
		}
		remove_char(str.substring(1),ans);
		return;
	}

}
