import java.util.Scanner;


public class NumberOfZeroesNFact {

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int s=0;
		for(int i=5; i<=n; i+=5){
			s=s+zeroes(i);
		}
		System.out.println(s);
		
		long c=fact(n);
		System.out.println(c);
		
		int d=zeroesLogn(n);
		System.out.println(d);
	}
	
	
	//O(logn)
	static int zeroesLogn(int n){
		int count=0;
		if(n<0){
			return -1;
		}
		/*int i=5;
		while(n/i>0){
			count+=n/i;
			i*=5;
		}*/
		
		for(int j=5; n/j>0; j*=5){
			count+=n/j;
		}
		return count;
	}
	
	
	
	static int zeroes(int a){
		int count=0;
		while(a%5==0){
			count++;
			a=a/5;
		}
		
		return count;
	}
	
	static long fact(int n){
		if(n==0){
			return 1;
		}
		if(n==1){
			return 1;
		}
		return n*fact(n-1);
	}
}
