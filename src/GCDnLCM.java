
public class GCDnLCM {

	public static void main(String[] args){
		int a=12, b=16;
		gcdNlcm(a,b);
	}
	
	static void gcdNlcm(int a, int b){
		int l=max(a,b)+1;
		int []A=new int[l];
		for(int i=0; i<l; i++){
			A[i]=i;
		}
		for(int k=0; k<l; k++){
			if(A[k]!=0 && A[k]!=1){
				for(int j=2*k; j<l; j=j+k){
					A[j]=1;
				}
			}
		}
		
		
		int [] B=new int [l];
		int [] C=new int [l];
		int g=a, s=b;
		for(int i=0; i<l; i++){
			if(A[i]!=0 && A[i]!=1){
				while(a%i==0){
					a=a/i;
					B[i]+=1;
				}
				while(s%i==0){
					s=s/i;
					C[i]+=1;
				}
			}
		}
		System.out.print("a= "+g+" = ");
		for(int i=0; i<l; i++){
			if(B[i]!=0){
				System.out.print(i+"(^"+B[i]+") ");
			}
		}
		System.out.println();
		System.out.print("b= "+b+" = ");
		for(int i=0; i<l; i++){
			if(C[i]!=0){
				System.out.print(i+"(^"+C[i]+") ");
			}
		}
		
		System.out.println();
		int gcd=1, lcm=1;
		for(int j=0; j<l; j++){
			int d=min(B[j], C[j]);
			gcd=(int) (gcd*Math.pow(j, d));
			
			int e=max(B[j], C[j]);
			lcm=(int) (lcm*Math.pow(j, e));
		}
		
		System.out.print("gcd of "+ g+" & "+b+" is "+gcd);
		System.out.println();
		System.out.print("lcm of "+ g+" & "+b+" is "+lcm);
	}
	
	
	static int max(int a, int b){
		return a>b?a:b;
	}
	
	
	static int min(int a, int b){
		return a>b?b:a;
	}
}
