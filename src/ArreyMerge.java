
public class ArreyMerge {

	public static void main(String[] args){
		int []A={1,5,7,8,10,14,15,18,20};
		int la=A.length;
		int []B={2,4,6,7,9,12,16,17,18,21,22,23};
		int lb=B.length;
		int [] c=arreyMerge(A, la, B, lb);
		for(int j=0; j<la+lb; j++)
			System.out.print(c[j]+" ");
		
		
	}
	
	static int [] arreyMerge(int [] A, int la, int [] B, int lb){
		int a=0, b=0, i=0;
		int []C=new int[la+lb];
		while(a<la && b<lb){
			C[i++]=min(A[a], B[b]);
			if(A[a]<B[b])
				a++;
			else if(A[a]>B[b])
				b++;
			else if(A[a]==B[b]){
				a++;
				b++;
			}
			
		}
		while(a<la){
			C[i++]=A[a];
			a++;
		}
		while(b<lb){
			C[i++]=B[b];
			b++;
		}
		
		return C;
	}
	
	static int min(int a, int b){
		return a<b?a:b;
	}
}
