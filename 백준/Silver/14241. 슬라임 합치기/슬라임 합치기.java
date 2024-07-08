import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] input = br.readLine().split(" ");
        for(int i=0; i<n; i++) {
        	arr[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);
        int cnt = 1;
        int sum = 0;
        while(arr[n-2] != 0) {
        	sum += arr[cnt] * arr[cnt-1];
        	arr[cnt] = arr[cnt] + arr[cnt-1];
        	arr[cnt-1] = 0;
        	cnt ++;
        	Arrays.sort(arr);
        }
        System.out.println(sum);
    }
}