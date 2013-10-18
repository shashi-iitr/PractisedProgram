// dyanamic programming

import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		long b=fact(a);
		System.out.print(b);
	}

	private static long fact(int i) {
		long [] Fact=new long [i+1];
		if(i==0)
			return 1;
		if(i==1)
			return 1;
		if(Fact[i]!=0)
			return Fact[i];
		Fact[i]=i*fact(i-1);
		return Fact[i];
	}
}
