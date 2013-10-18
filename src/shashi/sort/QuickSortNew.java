package shashi.sort;

import java.util.Scanner;

public class QuickSortNew {

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int []A=new int [N];
		int j=0;
		while(N-->0){
			A[j++]=in.nextInt();
		}
		quickSort(A, 0, j-1);
		for(int k=0; k<A.length; k++){
			System.out.print(A[k]+" ");
		}
	}
	
	static void quickSort(int []A, int p, int r){
		if(p<r){
			int x=partition(A, p, r);
			quickSort(A, 0, x-1);
			quickSort(A, x+1, r);
		}
	}
	
	static int partition(int []A, int p, int r){
		int pivot=A[p];
		int i=p, j=r;
		while(i<j){
			while(A[i]<=pivot && i<A.length-1){
				i++;
			}
			while(A[j]>pivot){
				j--;
			}
			if(i<j){
				swap(A, i, j);
			} 
		}
		A[p]=A[j];
		A[j]=pivot;
		return j;
	}
	
	static void swap(int []A, int i, int j){
		int temp=A[i];
		A[i]=A[j];
		A[j]=temp;
	}
}
