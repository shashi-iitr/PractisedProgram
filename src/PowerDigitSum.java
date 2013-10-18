public class PowerDigitSum {

	public static void main(String[] args){
		int n=2, m=10000;
		powerDigitSum(n,m);
	}
	
	static void powerDigitSum(int n, int m){
		int []A=new int[m+1];
		int ci=0; A[0]=1;
		for(int i=0; i<m; i++){
			int carry =0;
			for(int j=0; j<=ci; j++){
				A[j]=A[j]*n +carry;
				carry=A[j]/10;
				A[j]=A[j]%10;
				
			}
			while(carry>0){
				ci++;
				A[ci]=carry%10;
				carry=carry/10;
			}
		}
		int count=0;
		for(int i=ci; i>=0; i--){
			System.out.print(A[i]);
			count++;
		}
	
		System.out.print("\n\n"+count);
	}
}
