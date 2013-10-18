package shashi.sort;

public class CountingSort {

	public static void main(String[] args){
		int []A={2,2,4,6,3,5,1,3,0};
		int l=A.length;
		countingSort(A, l);
	}
	
	
	static void countingSort(int []A, int l){
		int []B=new int [l];
		int []C=new int [l];
		
		for(int i=0; i<l; i++){
			C[A[i]]++;
		}
		
		for(int i=1; i<l; i++){
			C[i]=C[i]+C[i-1];
		}
		
		for(int i=l-1; i>=0; i--){
			B[C[A[i]]-1]=A[i];
			C[A[i]]=C[A[i]]-1;
		}
		
		for(int b:B){
			System.out.print(b+" ");
		}
	}
}
