package sequences;

public class lowerCaseO_notation {
	public static void sequence(int n) {
	/* 
	 * Infiumum seems to be 0 
	 * -> sequence seems to converge to zero
	 * -> it is a so called null sequence
	 * => o-Notation
	 */
		double a_n;
		double b_n;
		
		for(int i = 1; i <= n; i++) {
			a_n = 25*(i * i) + 33*i + 45;
			b_n = i * i * i * i;
			
			System.out.println(a_n/b_n);
		}
	}

	public static void main(String[] args) {
		int upper_limit = 100;
		
		sequence(upper_limit);

	}

}
