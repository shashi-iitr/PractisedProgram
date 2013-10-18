
public class PythaTriplet {
	public static void main(String[] args) {
		int [] A={2, 9, 4, 5, 3, 60, 8, 30, 33, 45, 10, 40, 7, 50, 6};
		int l=A.length;
		qSortArr(A,0, l-1);
		for(int i=0; i<l; i++){
			System.out.print(A[i]+" ");
		}
		System.out.println("\n");
		//pythaTripletN3(A, l);
		pythaTripletN2(A, l);
	}
	
	static void qSortArr(int []A, int p, int l){
		if(p<l){
			int x=partition(A, p,l);
			qSortArr(A, p, x);
			qSortArr(A, x+1, l);
		}
	}
	
	static int partition(int []A, int p, int q){
		int i=p, j=q, x=A[p];
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
		int t=A[i];
		A[i]=A[j];
		A[j]=t;
	}

	//n^3
	static void pythaTripletN3(int [] A, int l){
		int c=0;
		int []B=new int [l];
		for(int i=0; i<l; i++){
			B[i]=(int) Math.pow(A[i], 2);
		}
		for(int i=0; i<l-2; i++)
			for(int j=i+1; j<l-1; j++)
				for(int k=j+1; k<l; k++)
					if(B[i]+B[j]==B[k]){
						System.out.print("("+A[i]+", "+A[j]+", "+A[k]+")"+" ");
						c++;
					}
		System.out.println("\n"+c);
	}
	
	
	//n^2
	static void pythaTripletN2(int [] A, int l){
		int c=0;
		int []B=new int[l];
		for(int i=0; i<l; i++){
			B[i]=A[i]*A[i];
		}
		for(int j=2; j<l; j++){
			int k=0, n=j-1;
			while(k<n){
				if(B[k]+B[n]==B[j]){
					System.out.print("("+A[k]+", "+A[n]+", "+A[j]+")"+" ");
					k++;
					n--;
					c++;
				}
				else if(B[k]+B[n]>B[j])
					n--;
				else
					k++;
			}
		}
		System.out.print("\n"+"index= " +c);
	}
}
