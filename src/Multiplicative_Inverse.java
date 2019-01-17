
public class Multiplicative_Inverse {

	public static void main(String[] args) {
		modInverse(26, 11);
	}

	public static void modInverse(int n, int b) {
		int r1 = n;
		int r2 = b;
		int t1 = 0;
		int t2 = 1;

		
		while (r2 > 0) {
			int q = r1/r2;
			
			int r = r1 - q * r2;
			r1 = r2;
			r2 = r;
			
			int t = t1 - q * t2;
			t1 = t2;
			t2 = t;
		}
		
		if(r1 == 1) {
			System.out.println(t1);
		}
	}

}
