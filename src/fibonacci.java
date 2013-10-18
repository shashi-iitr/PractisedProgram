
public class fibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20;
		
		//recursive
		
		/*for(int i=0; i<=a; i++){
		int b=fib(i);
		System.out.print(b+" ");
		}*/
		
		long fib[]=new long [a+1];
		fib[0]=0;
		fib[1]=1;
		for(int i=2; i<=a; i++){
			fib[i]= fib[i-1]+fib[i-2];
		}
		for(int i=0; i<=a; i++){
			System.out.print(fib[i] +" ");
		}
	}

	
	/*static int fib(int i){
		if(i==0)
			return 0;
		if(i==1)
			return 1;
		return fib(i-1)+fib(i-2);
	}*/
}

