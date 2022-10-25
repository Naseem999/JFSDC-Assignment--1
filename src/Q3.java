
public class Q3 {

//	WAP a Program to Print Hut Pattern 

	public static void main(String[] args) {

		int n = 15, i, j;

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if((i+j<=(n-1)/2)||
						(j==0||j==n-1)||
						(j-i>=(n-1)/2)||
						(i==n-1)
						)
                System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
