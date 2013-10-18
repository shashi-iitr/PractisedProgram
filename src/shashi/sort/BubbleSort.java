package shashi.sort;

//import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args){
		
			
			int[] A={9, 2, 7, 5, 3, 8, 1, 0, 3, 6};
			int n=A.length;
			for(int i=0; i<n; i++){
				for(int j=0; j<n-1; j++){
					if(A[j]>A[j+1]){
						int temp=A[j];
						A[j]=A[j+1];
						A[j+1]=temp;
					}
				}
			}
					
			for(int i=0; i<n; i++){		
				System.out.print(A[i]+" ");
			}
	}
}
