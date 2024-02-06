package java_topic_wise;

public class Bubble_sort_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,3,2,1};
		bubble(arr,3,0);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void bubble(int[] arr,int r,int c) {
		if(r==0) {
			return;
		}
		if(c<r) {
			if(arr[c]>arr[c+1]) {
				int temp=arr[c+1];
				arr[c+1]=arr[c];
				arr[c]=temp;
			}
			bubble(arr,r,++c);
		}
		else{
			bubble(arr,--r,0);
		}
		
		
	}

}
