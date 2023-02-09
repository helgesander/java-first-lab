public class Primes {
	public static void main(String []args) {
		for (int i = 3; i <= 100; i++) {
			if (IsPrime(i)) System.out.println(i);
			//System.out.println("Done" + i);
		} 
	}
	public static boolean IsPrime(int n) {
		for (int i = 2; i < (n); i++) {
			if (n % i == 0) return false;  
		}
		return true;
	}
	
}