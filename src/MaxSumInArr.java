
public class MaxSumInArr {

	public static void main(String[] args){
		int []A={2, 8, -3, 6, -13, 4, 7, 2, -18, 19, -17, 8, -16, 10};
		int b=maxSum(A);
		System.out.println(b);
	}
	
	static int maxSum(int []A){
		int sum=0, sumMax=A[0];
		int l=A.length;
		int i=0;
		while(i<l){
			sum+=A[i];
			if(sum<0){
				sum=0;
				i++;
			} else {
				if(sum>sumMax){
					sumMax=sum;
					i++;
				} else i++;
			}
		}
		return sumMax;
	}
	
}
