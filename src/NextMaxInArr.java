public class NextMaxInArr {

	public static void main(String[] args) {
		int[] A = { 7,6,3,4,3,8, 4, 2, 4, 7, 6, 5, 9, 17, 16, 15,14, 17 };
		int l = A.length;
		nextMax(A,l);
	}

	static void nextMax(int []A, int l){
		
		int []B=new int [l];
		int i=l-2, j=0;
		int max=A[l-1];
		while(i>0){
			if(A[i]>A[i-1] && A[i]>max){
				B[j++]=0;
				max=A[i];
			} else if(A[i]>A[i-1] && A[i]<max){
				B[j++]=max;
				max=A[i];
			} else if(A[i]>A[i-1] && A[i]==max){
				int t=j-1;
				if(t<=0){
					B[j++]=0;
					max=A[i];
				}
				else {while(B[j-1]>=B[t-1] && t>-1){
					t--;
				}
				if(B[j-1]<B[t]){
					B[j++]=B[t];
					max=B[t];
				} 
				}
				
			} else if(A[i]<A[i-1] && A[i]<max){
				B[j++]=max;
			} else if(A[i]<A[i-1] && A[i]>max){
				B[j++]=0;
				max=A[i];
			} else if(A[i]<A[i-1] && A[i]==max){
				int t=j-1;
				if(t<=0){
					B[j++]=0;
					max=A[i];
				} else{
				while(B[j-1]>=B[t-1] && t>-1){
					t--;
				}
				if(B[j-1]<B[t]){
					B[j++]=B[t];
					max=B[t];
				} 
				}
				
			}
			i--;
		}
		for(int h=0; h<l; h++){
			System.out.print(A[h]+" ");
		}
		System.out.println();
		for(int k=j-1; k>=0; k--){
			System.out.print(B[k]+" ");
		}
	}
}