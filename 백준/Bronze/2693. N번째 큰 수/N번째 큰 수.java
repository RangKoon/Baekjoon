import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			String[] input = br.readLine().split(" ");
			int[] arr = new int[10];
			for(int j=0; j<10; j++) {
				arr[j] = Integer.parseInt(input[j]);
			}
			Arrays.sort(arr);
			sb.append(arr[7] + "\n");
		}
		System.out.println(sb);
	}
}