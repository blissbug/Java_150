package java_topic_wise;

public class Selection_sort_by_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,5,1,2,3,2};
		selection_sort(arr,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}

	}public static void selection_sort(int[] arr,int index) {
		if(index==0) {
			return;
		}
		int max=arr[0];
		int swap_i=index;
		for(int i=0;i<=index;i++) {
			int curr=arr[i];
			max=Math.max(max, curr);
			if(arr[i]==max) {
				swap_i=i;
			}
		}
		int temp=arr[index];
		arr[index]=arr[swap_i];
		arr[swap_i]=temp;
		selection_sort(arr,--index);

	}

}
