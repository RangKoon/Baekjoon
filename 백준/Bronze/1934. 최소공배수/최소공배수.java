import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t_case = sc.nextInt();

		for (int i = 0; i < t_case; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int max = 0;
			if (a > max)
				max = a;
			if (b > max)
				max = b;
			int tmp = 1;

			for (int j = 2; j <= max; j++) {
				if (a % j == 0 && b % j == 0) {
					tmp = j;
				}
			}
			System.out.println(tmp * a / tmp * b / tmp);
		}
	}
}