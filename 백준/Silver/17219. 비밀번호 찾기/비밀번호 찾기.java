import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		HashMap <String,String> map = new HashMap<>();
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		for(int i=0; i<n; i++) {
			String[] input2 = br.readLine().split(" ");
			map.put(input2[0], input2[1]);
		}
		for(int i=0; i<m; i++) {
			String input3 = br.readLine();
			sb.append(map.get(input3) + "\n");			
		}
		System.out.println(sb);
	}
}