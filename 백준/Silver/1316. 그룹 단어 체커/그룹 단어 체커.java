import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String arr[] = new String[n];
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
			int len = arr[i].length();
			
			if (len <= 2)
				cnt++;

			else {
				boolean bool = true;
				for (int j = 1; j < len; j++) {
					if (arr[i].charAt(j - 1) != arr[i].charAt(j)) {
						for (int k = j + 1; k < len; k++) {
							if (arr[i].charAt(j - 1) == arr[i].charAt(k)) {
								bool = false;
							}
						}
					}
				}
				if (bool == true)
					cnt++;
			}
		}
		System.out.println(cnt);
	}
}