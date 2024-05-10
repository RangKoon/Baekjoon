import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		arr[1] = 0;
		for(int i=2; i<=n; i++) {
			ArrayList<Integer> alist = new ArrayList<>();
			if(i%2==0)
				alist.add(i/2);
			if(i%3==0)
				alist.add(i/3);
			alist.add(i-1);
				
			int len = alist.size();
			int tmp = alist.get(0);
			
			for(int j=1; j<len; j++) {
				if(arr[alist.get(j)] < arr[alist.get(j-1)]) {
					tmp = alist.get(j);
				}
			}
			arr[i] = arr[tmp] +1;
			
		}
		System.out.println(arr[n]);
	}
}