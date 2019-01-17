
public class Euclidean_Algo {

	public static void main(String[] args) {

		gcd(10, 15);
	}

	public static void gcd(int a, int b) {
		int r1 = a;
		int r2 = b;

		while (r2 > 0) {
			int q = r1 / r2;
			int r = r1 - q * r2;
			r1 = r2;
			r2 = r;
		}

		System.out.println(r1);

	}
}
