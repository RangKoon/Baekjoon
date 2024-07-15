import java.util.*;
import java.io.*;
        
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int k = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        int m = Integer.parseInt(input[2]);
        int sum = k*n - m;
        if(sum <= 0) {
        	System.out.println("0");
        }
        else {
        	System.out.println(sum);
        }
    }   
}          