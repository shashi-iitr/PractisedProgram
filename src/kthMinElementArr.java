import java.util.Scanner;


public class kthMinElementArr {

	public static void main(String [] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int k=in.nextInt();
		int A[]=new int [N];
		int i=0;
		
		while(N-->0){
			A[i++]=in.nextInt();
		}
		
		kthMinEle(A, k, 0, i-1);
	}
	
	static void kthMinEle(int [] A, int k, int p, int q){
		int x=0;
		if(p<q){
			x=partition(A, p, q);
			
			if(x==k-1){
				System.out.print(A[x]);
				return;
			} else if(x>(k-1)){
				kthMinEle(A,k, p, x-1);
			} else {
				kthMinEle(A,k, x+1, q);
				
			}
			
		} else if(p==q){
			System.out.print(A[p]);
		}
		
	}
	
	static int partition(int []A, int p, int r){
		int x=A[p];
		int i=p, j=r;
		while(i<j){
			while(A[i]<x){
				i++;
			}
			while(A[j]>x){
				j--;
			}
			if(i<j){
				swap(A, i, j);
			}
		}
		return j;
	}
	
	static void swap(int []A, int i, int j){
		int temp=A[i];
		A[i]=A[j];
		A[j]=temp;
	}
}
