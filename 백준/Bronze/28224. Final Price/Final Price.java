import java.util.*;
import java.io.*;
        
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i=0; i<t; i++) {
        	int n = Integer.parseInt(br.readLine());
        	sum += n;
        }
        System.out.println(sum);
        
    }   
}          