package java_topic_wise;

public class Rotated_binary_search_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,4,5,6,7,1,2,3};
		System.out.println(rotated_search(arr,0,arr.length-1,4));
		
	}public static int rotated_search(int[] arr,int lo,int hi,int num) {
		int mid=lo+(hi-lo)/2;
		while(lo<=hi) {
			if(arr[mid]==num) {
				return mid;
			}
			else if(arr[lo]==arr[mid] && arr[mid]==arr[hi]) {
				lo=lo+1;
				hi=hi-1;
			}
			else if(arr[lo]<=arr[mid]) {
				if(num>=arr[lo] && num<arr[mid]) {
					hi=mid-1;
				}
				else {
					lo=mid+1;
				}
			}
			else if(arr[mid]<num && num<=arr[hi]) {
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
			return rotated_search(arr,lo,hi,num);
		}
		return -1;
		
	}
	}
