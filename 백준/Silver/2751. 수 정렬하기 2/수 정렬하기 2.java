import java.util.*;
import java.io.*;
import java.math.*;
        
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++) {
        	arr.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.size(); i++) {
        	sb.append(arr.get(i) + "\n");
        }
        System.out.println(sb);
    }   
}   