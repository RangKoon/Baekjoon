import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean bool = true;
		while (bool) {
			if (n == 1)
				bool = false;
			else {
				for (int i = 2;; i++) {
					if (n % i == 0) {
						System.out.println(i);
						n /= i;
						if (n == 1)
							bool = false;
						break;
					}
				}
			}
		}
	}
}