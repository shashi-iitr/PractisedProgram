public class primesum {
	public static void main(String[] args) {
		int n = 13, sum=0, count=0;
		
		for(int i=2; i<=n; i++)
			if (isPrime(i)){
				count++;
				System.out.print(i+", ");
				sum=sum+i;
			}
		System.out.println();
		System.out.print(sum+" "+count);		
	}
	

	static boolean isPrime(int j) {
		int sqrn = (int) Math.sqrt(j);
		for (int i = 2; i<=sqrn; i++){
			if(j%i==0)
				return false;
		}
		return true;
	}
}