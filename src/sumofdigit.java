public class sumofdigit {
	public static void main(String[] args) {
		long a = 398789745, sum=0;
		while(a>0){
			sum+=a%10;
			a=a/10;
		}
		System.out.println("sum of the digits is= " + sum);
	}
}
