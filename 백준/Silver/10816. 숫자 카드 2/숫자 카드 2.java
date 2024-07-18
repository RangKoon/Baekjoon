import java.util.*;
import java.io.*;
        
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();
        String[] input1 = br.readLine().split(" ");
        int[] cntarr = new int[20_000_001];
        for(int i=0; i<n; i++) {
        	cntarr[(Integer.parseInt(input1[i])) + 10_000_000] ++;
        }
        int m = Integer.parseInt(br.readLine());
        String[] input2 = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<m; i++) {
        	int tmp = Integer.parseInt(input2[i]);
        	sb.append(cntarr[tmp + 10_000_000] + " ");
        }
        System.out.println(sb);
    }   
}          