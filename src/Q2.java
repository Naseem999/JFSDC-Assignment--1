
public class Q2 {

	/*
	 * 2. Write a program to print
	 * 
	 *  1 1 1 1
	 *  2 2 2 2 
	 *  3 3 3 3
	 *  4 4 4 4
	 * 
	 */
	public static void main(String[] args) {

// Variable declaration

		int n = 5, i, j;

//		Printing Number Pattern
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {

				if (i > 0 && j < n - 1) {
					System.out.print(i);
				}

			}
			System.out.println();
		}

	}

}
