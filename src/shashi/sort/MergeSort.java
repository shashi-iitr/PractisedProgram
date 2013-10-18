package shashi.sort;

public class MergeSort {

	public static void main(String[] args){
		int []A={3,5,1,6,8,2,9,7,0};
		int l=A.length;
		int []temp=new int [l];
		mergeSort(A, temp, 0, l-1);
		for(int a:A){
			System.out.print(a+" ");
		}
	}
	
	static void mergeSort(int []A, int []temp, int low, int high){
		int mid;
		if(low<high){
			mid=(low+high)/2;
			mergeSort(A, temp, low, mid);
			mergeSort(A, temp, mid+1, high);
			merge(A, temp, low, mid+1, high);
		}
	}
	
	static void merge(int []A, int [] temp, int low, int mid, int high){
		int i, low_end, temp_pos, size;
		low_end=mid-1;
		temp_pos=low;
		size=high-low+1;
		
		while(low<=low_end && mid<=high){
			if(A[low]<=A[mid]){
				temp[temp_pos]=A[low];
				temp_pos+=1;
				low+=1;
			} else {
				temp[temp_pos]=A[mid];
				temp_pos+=1;
				mid+=1;
			}
			
		}
		
		while(low<=low_end){
			temp[temp_pos]=A[low];
			temp_pos+=1;
			low+=1;
		}
		
		while(mid<=high){
			temp[temp_pos]=A[mid];
			temp_pos+=1;
			mid+=1;
		}
		
		for(i=0; i<size; i++){
			A[high]=temp[high];
			high-=1;
		}
	}
}
