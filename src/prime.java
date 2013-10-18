public class prime {

	public static void main(String[] args) {
		int n = 53, j = 2, count = 0;
		while (j < n)
			if (isPrime(j++)) {
				count++;
				System.out.print((j-1) + ", ");
			}
		System.out.println("\n \n" + "number of primes= " + count);
	}

	
	static boolean isPrime(int n) {
		if(n==2){
			return true;
		} 
		if(n%2==0){
			return false;
		}
		int sqrn = (int) Math.sqrt(n);
		for (int i = 3; i <= sqrn; i+=2)
			if (n % i == 0)
				return false;
		return true;
	}
}