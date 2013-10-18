
public class SmallestMultipleProEuler {

	public static void main(String[] args){
		int n=20;
		int [] A=new int [n+1];
		int [] B=new int [n+1];
		for(int i=0; i<=n; i++){
			A[i]=i;
		}
		for(int i=0; i<=n; i++){
			if(A[i]!=1 && A[i]!=0){
				for(int j=2*i; j<=n; j+=i){
					A[j]=1;
				}
			}
		}
		
		for(int i=0; i<=n; i++)
			for(int j=0; j<=i; j++){
				if(A[j]!=1 && A[j]!=0){
					
				int l=i, count=0;
				while(l%A[j]==0){
					count++;
					l=l/A[j];
					B[j]=max(B[j], count);
				}
				
			}
		}
		
		for(int k=0; k<=n; k++){
			if(B[k]!=0)
				B[k]=(int) Math.pow(k, B[k]);
		}
		
		int N=1;
		for(int i=0; i<=n; i++){
			if(B[i]!=0){
				N=N*B[i];
			}
		}
		System.out.print(N);
	}
	
	static int max(int a, int b){
		if(a>b)
			return a;
		else return b;
	}
}
