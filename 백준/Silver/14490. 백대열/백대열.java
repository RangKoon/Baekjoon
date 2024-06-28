import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(":");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int max = n;
        if(n < m)
        	max = m;
        for(int i=max; i>1; i--) {
        	if(n % i == 0 && m % i == 0) {
        		n /= i;
        		m /= i;
        		break;
        	}
        }
        System.out.println(n+":"+m);
        	
        
    }
}