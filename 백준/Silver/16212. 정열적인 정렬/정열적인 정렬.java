import java.util.*;
import java.io.*;
        
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        String num[] = br.readLine().split(" ");
        int real_num[] = new int[n];
        for(int i=0; i<n; i++) {
        	real_num[i] = Integer.parseInt(num[i]);
        }
        for(int i=0; i<n; i++) {
        	arr.add(real_num[i]);
        }
        arr.sort(Comparator.naturalOrder());
        for(int i=0; i<n; i++) {
        	System.out.print(arr.get(i) + " ");
        }
    }   
}   