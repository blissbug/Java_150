package java_topic_wise;

public class Recusion_triangle_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print2(4,0);

	}public static void print(int r,int c) {
		if(r==0) {
			return;
		}
		if(c<r) {
			System.out.print("*");	
			print(r,++c);
			}
		else{
			System.out.println();
			print(--r,0);
		}
		
		
	}
	public static void print2(int r,int c) {
		if(r==0) {
			return;
		}
		if(c<r) {
			print2(r,++c);
			System.out.print("*");	

			}
		else{
			print2(--r,0);
			System.out.println();
		}
		
		
	}

}
