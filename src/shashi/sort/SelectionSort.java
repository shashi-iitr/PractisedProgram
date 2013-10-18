package shashi.sort;

public class SelectionSort {

	public static void main(String[] args){
		int []A={5,2,4,3,1,6,7};
		int l=A.length, min;
		for(int i=0; i<l-1; i++){
			min=i;
			for(int j=i+1; j<l; j++){
				if(A[j]<A[min]){
					min=j;
				}
			}
			swap(A, min, i);
		}
		for(int a:A){
			System.out.print(a+" ");
		}
	}
	
	static void swap(int []A, int b, int a){
		int t=A[a];
		A[a]=A[b];
		A[b]=t;
	}
}
