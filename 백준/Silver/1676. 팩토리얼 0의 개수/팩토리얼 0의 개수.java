import java.util.*;
import java.io.*;
import java.math.*;
        
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num5 = 0;
        for(int i=1; i<=n; i++) {
        	for(int j=5; j<=125; j*= 5) {
        		if(i%j == 0) {
        			num5 ++;
        		}
        	}
        }
        System.out.println(num5);
    }   
}   