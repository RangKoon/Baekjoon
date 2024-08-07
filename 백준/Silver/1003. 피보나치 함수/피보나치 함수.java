import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<t; i++) {
        	int n = Integer.parseInt(br.readLine());
        	int[] arr0 = new int[n+2];
        	int[] arr1 = new int[n+2];
        	arr0[0] = 1;
        	arr1[0] = 0;
        	arr0[1] = 0;
        	arr1[1] = 1;
        	for(int j=2; j<=n; j++) {
        		arr0[j] = arr0[j-1] + arr0[j-2];
        		arr1[j] = arr1[j-1] + arr1[j-2];
        	}
        	sb.append(arr0[n] + " " + arr1[n] + "\n");
        }
        System.out.println(sb);
    }
}