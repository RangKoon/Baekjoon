import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        float arr[] = new float[n];
        for(int i=0; i<n; i++) {
        	arr[i] = Float.parseFloat(br.readLine());
        }
        Arrays.sort(arr);
        for(int i=0; i<7; i++) {
        	System.out.printf("%.3f\n",arr[i]);
        }
    }
}