import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long arr[] = new long[1_000_001];
		arr[0] = 0;
		arr[1] = 1;
		
		
		for(int i=2; i<=n; i++) {
			arr[i] = (arr[i-1] + arr[i-2])%1_000_000_007;
		}
		System.out.println(arr[n]);

	}
}