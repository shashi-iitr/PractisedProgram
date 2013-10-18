public class ZeroAyrray {
	public static void main(String[] args){
		int n=4, m=5;
		int [][]A={{1,2,3,4,5},{0,2,3,6,8},{4,5,9,8,9},{3,4,0,6,7}};
		printArray(A, n, m);
		System.out.println();
		int [][]b=zeroArray(A, n, m);
		printArray(A, n, m);
	}
	
	static int [][] zeroArray(int [][]A, int n, int m){
		int []I=new int[n];
		int []J=new int[m];
		
		for(int i=0; i<n; i++)
			for(int j=0; j<m; j++)
				if(A[i][j]==0){
					I[i]=1;
					J[j]=1;
				}
		
		for(int i=0; i<n; i++)
			for(int j=0; j<m; j++)
				if(I[i]==1)
					A[i][j]=0;
		
		for(int j=0; j<m; j++)
			for(int i=0; i<n; i++)
				if(J[j]==1)
					A[i][j]=0;
		return A;
	}

	
	static void printArray(int [][]A, int n, int m){
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++)
				System.out.print(A[i][j]+" ");
			System.out.println();
		}
	}
}
