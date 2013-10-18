import java.util.Scanner;


public class SumLastDigBaseExp {

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=1; i<t; i++){
			int base=in.nextInt();
			int exp=in.nextInt();
			lastDig(base, exp);
		}
	}
	
	static void lastDig(int base, int exp){
		if(exp==0){
			System.out.println(1);
		}
		else{
			exp%=4;
			if(exp==0)
				System.out.println();
		}
	}
}
