package shashi.sort;

public class Insertion {

	public static void main(String[] args){
		int []A={5,2,4,3,1,6,7};
		int n=A.length; int k=0;
		for(int i=1; i<n; i++){
			k=A[i];
			int j=i-1;
			while(j>-1 && A[j]>k){
				A[j+1]=A[j];
				j=j-1;
			}
			A[j+1]=k;
		}
		for(int p=0; p<n; p++){
			System.out.print(A[p]+" ");
		}
	}
}
