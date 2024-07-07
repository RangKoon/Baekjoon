import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        long[] arr = new long[70];
        arr[0] = arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        for(int i=4; i<70; i++) {
        	arr[i] = arr[i-1] + arr[i-2] + arr[i-3] + arr[i-4];
        }
        for(int i=0; i<t; i++) {
        	int n = Integer.parseInt(br.readLine());
        	sb.append(arr[n] + "\n");
        }
        System.out.println(sb);
    }
}