import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		int sumarr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		for(int i=0; i<n; i++) {
			for(int j = 0; j<=i; j++) {
				sumarr[i] += arr[j];
			}
			sum += sumarr[i];
		}
		System.out.println(sum);
	}
}